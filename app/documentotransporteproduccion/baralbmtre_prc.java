package app.documentotransporteproduccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class baralbmtre_prc extends GXProcedure
{
   public baralbmtre_prc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( baralbmtre_prc.class ), "" );
   }

   public baralbmtre_prc( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( java.math.BigDecimal aP0 )
   {
      baralbmtre_prc.this.aP1 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( java.math.BigDecimal aP0 ,
                        java.math.BigDecimal[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( java.math.BigDecimal aP0 ,
                             java.math.BigDecimal[] aP1 )
   {
      baralbmtre_prc.this.AV10baralbmtreIN = aP0;
      baralbmtre_prc.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11baralbmtreout = AV10baralbmtreIN ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = baralbmtre_prc.this.AV11baralbmtreout;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11baralbmtreout = DecimalUtil.ZERO ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private java.math.BigDecimal AV10baralbmtreIN ;
   private java.math.BigDecimal AV11baralbmtreout ;
   private java.math.BigDecimal[] aP1 ;
}

