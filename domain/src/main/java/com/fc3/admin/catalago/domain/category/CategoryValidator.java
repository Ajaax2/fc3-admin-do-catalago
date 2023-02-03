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
        checkNameConstraints();
    }

    private void checkNameConstraints() {
        final var name = this.category.getName();
        final var NAME_MAX_LENGTH = 255;
        final var NAME_MIN_LENGTH = 3;

        if (name == null || name.isBlank()
                || name.trim().length() > NAME_MAX_LENGTH
                || name.trim().length() < NAME_MIN_LENGTH ) {
            this.validationHandler().append(new Error("'name' must be valid"));
        }
    }
}
