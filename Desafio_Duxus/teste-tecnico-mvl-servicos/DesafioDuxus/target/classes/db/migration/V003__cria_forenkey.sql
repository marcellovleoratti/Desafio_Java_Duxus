alter table integrante ADD CONSTRAINT fk_times 
FOREIGN KEY(id) REFERENCES times (id);