package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pincdevolucion extends GXProcedure
{
   public pincdevolucion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pincdevolucion.class ), "" );
   }

   public pincdevolucion( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             java.util.Date[] aP3 ,
                             java.util.Date[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 )
   {
      pincdevolucion.this.aP9 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        java.util.Date[] aP3 ,
                        java.util.Date[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             java.util.Date[] aP3 ,
                             java.util.Date[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 )
   {
      pincdevolucion.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pincdevolucion.this.AV11DevGenCod = aP1[0];
      this.aP1 = aP1;
      pincdevolucion.this.AV18AlbRecCod = aP2[0];
      this.aP2 = aP2;
      pincdevolucion.this.AV14DevGenFec = aP3[0];
      this.aP3 = aP3;
      pincdevolucion.this.AV13oldDevGenFec = aP4[0];
      this.aP4 = aP4;
      pincdevolucion.this.AV15DevPieUni = aP5[0];
      this.aP5 = aP5;
      pincdevolucion.this.AV16oldDevPieUni = aP6[0];
      this.aP6 = aP6;
      pincdevolucion.this.AV17AlbRecpie = aP7[0];
      this.aP7 = aP7;
      pincdevolucion.this.AV12Inc_obs = aP8[0];
      this.aP8 = aP8;
      pincdevolucion.this.Gx_mode = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12Inc_obs = httpContext.getMessage( "Devolucion Tela, N Recepcion =", "") + GXutil.str( AV18AlbRecCod, 8, 0) + GXutil.newLine( ) ;
      if ( GXutil.strcmp(AV17AlbRecpie, "X") == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "DLT", "")) == 0 )
         {
            AV12Inc_obs += httpContext.getMessage( "Eliminacion TOTAL. Documento Nº ", "") + GXutil.str( AV11DevGenCod, 8, 0) + GXutil.newLine( ) ;
         }
         else
         {
            AV12Inc_obs += httpContext.getMessage( "Fecha Documento ", "") + localUtil.dtoc( AV13oldDevGenFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + httpContext.getMessage( " cambia a ", "") + localUtil.dtoc( AV14DevGenFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + GXutil.newLine( ) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "DLT", "")) == 0 )
         {
            AV12Inc_obs += httpContext.getMessage( "Pieza Eliminada ", "") + AV17AlbRecpie + GXutil.newLine( ) ;
         }
         else
         {
            if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "INS", "")) == 0 )
            {
               AV12Inc_obs += httpContext.getMessage( "Alta Pieza Nº ", "") + AV17AlbRecpie + GXutil.newLine( ) ;
            }
            else
            {
               AV12Inc_obs += httpContext.getMessage( "Modif Pieza Nº ", "") + AV17AlbRecpie + GXutil.newLine( ) ;
            }
            AV12Inc_obs += httpContext.getMessage( "Unidades ", "") + GXutil.str( AV16oldDevPieUni, 9, 2) + httpContext.getMessage( " cambia a ", "") + GXutil.str( AV15DevPieUni, 9, 2) + GXutil.newLine( ) ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pincdevolucion.this.A396EmprCod;
      this.aP1[0] = pincdevolucion.this.AV11DevGenCod;
      this.aP2[0] = pincdevolucion.this.AV18AlbRecCod;
      this.aP3[0] = pincdevolucion.this.AV14DevGenFec;
      this.aP4[0] = pincdevolucion.this.AV13oldDevGenFec;
      this.aP5[0] = pincdevolucion.this.AV15DevPieUni;
      this.aP6[0] = pincdevolucion.this.AV16oldDevPieUni;
      this.aP7[0] = pincdevolucion.this.AV17AlbRecpie;
      this.aP8[0] = pincdevolucion.this.AV12Inc_obs;
      this.aP9[0] = pincdevolucion.this.Gx_mode;
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
   private int AV11DevGenCod ;
   private int AV18AlbRecCod ;
   private java.math.BigDecimal AV15DevPieUni ;
   private java.math.BigDecimal AV16oldDevPieUni ;
   private String A396EmprCod ;
   private String AV17AlbRecpie ;
   private String Gx_mode ;
   private java.util.Date AV14DevGenFec ;
   private java.util.Date AV13oldDevGenFec ;
   private String AV12Inc_obs ;
   private String[] aP9 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private java.util.Date[] aP3 ;
   private java.util.Date[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
}

