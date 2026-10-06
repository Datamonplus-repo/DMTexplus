package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdevval extends GXProcedure
{
   public pdevval( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdevval.class ), "" );
   }

   public pdevval( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( java.math.BigDecimal[] aP0 )
   {
      pdevval.this.aP1 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( java.math.BigDecimal[] aP0 ,
                        java.math.BigDecimal[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( java.math.BigDecimal[] aP0 ,
                             java.math.BigDecimal[] aP1 )
   {
      pdevval.this.AV9Entrada = aP0[0];
      this.aP0 = aP0;
      pdevval.this.AV8Devolver = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Devolver = AV9Entrada ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdevval.this.AV9Entrada;
      this.aP1[0] = pdevval.this.AV8Devolver;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private java.math.BigDecimal AV9Entrada ;
   private java.math.BigDecimal AV8Devolver ;
   private java.math.BigDecimal[] aP1 ;
   private java.math.BigDecimal[] aP0 ;
}

