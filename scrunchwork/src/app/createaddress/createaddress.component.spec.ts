import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateaddressComponent } from './createaddress.component';

describe('CreateaddressComponent', () => {
  let component: CreateaddressComponent;
  let fixture: ComponentFixture<CreateaddressComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CreateaddressComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CreateaddressComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
