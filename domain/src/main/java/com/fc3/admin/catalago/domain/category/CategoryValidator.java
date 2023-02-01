package com.fc3.admin.catalago.domain.category;

import com.fc3.admin.catalago.domain.validation.Error;
import com.fc3.admin.catalago.domain.validation.ValidationHandler;
import com.fc3.admin.catalago.domain.validation.Validator;

public class CategoryValidator extends Validator {

    private final Category category;

    public CategoryValidator(final Category aCategory, final ValidationHandler aHandler) {
        super(aHandler);
        this.category = aCategory;
    }

    @Override
    public void validate() {
        if(this.category.getName() == null ||
                this.category.getName().isEmpty()){
            this.validationHandler().append(new Error("'name' should not be null"));
        }
    }
}
