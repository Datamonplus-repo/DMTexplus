package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class existenlineasconcantidadacero extends GXProcedure
{
   public existenlineasconcantidadacero( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( existenlineasconcantidadacero.class ), "" );
   }

   public existenlineasconcantidadacero( int remoteHandle ,
                                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             String aP3 )
   {
      existenlineasconcantidadacero.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        String aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             String aP3 ,
                             String[] aP4 )
   {
      existenlineasconcantidadacero.this.A396EmprCod = aP0;
      existenlineasconcantidadacero.this.A5532Lb_numero = aP1;
      existenlineasconcantidadacero.this.A5555Lb_opcion = aP2;
      existenlineasconcantidadacero.this.AV9tabla = aP3;
      existenlineasconcantidadacero.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8mensaje = "" ;
      if ( GXutil.strcmp(AV9tabla, "ENS003") == 0 )
      {
         /* Using cursor P0AOB2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A5558LB_CantC = P0AOB2_A5558LB_CantC[0] ;
            A5557Lb_LineaC = P0AOB2_A5557Lb_LineaC[0] ;
            if ( A5558LB_CantC.doubleValue() == 0 )
            {
               if ( GXutil.strcmp(AV8mensaje, " ") == 0 )
               {
                  AV8mensaje = httpContext.getMessage( "Linea(s) con Cantidad = 0 :", "") + GXutil.newLine( ) ;
                  AV8mensaje += GXutil.trim( GXutil.str( A5557Lb_LineaC, 4, 0)) ;
               }
               else
               {
                  AV8mensaje += GXutil.trim( GXutil.str( A5557Lb_LineaC, 4, 0)) ;
               }
            }
            pr_default.readNext(0);
         }
         pr_default.close(0);
      }
      else if ( GXutil.strcmp(AV9tabla, "ENS004") == 0 )
      {
         /* Using cursor P0AOB3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A5561LB_CantP = P0AOB3_A5561LB_CantP[0] ;
            A5560Lb_LineaPr = P0AOB3_A5560Lb_LineaPr[0] ;
            if ( A5561LB_CantP.doubleValue() == 0 )
            {
               if ( GXutil.strcmp(AV8mensaje, " ") == 0 )
               {
                  AV8mensaje = httpContext.getMessage( "Linea(s) con Cantidad = 0 :", "") + GXutil.newLine( ) ;
                  AV8mensaje += GXutil.trim( GXutil.str( A5560Lb_LineaPr, 4, 0)) ;
               }
               else
               {
                  AV8mensaje += GXutil.trim( GXutil.str( A5560Lb_LineaPr, 4, 0)) ;
               }
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = existenlineasconcantidadacero.this.AV8mensaje;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8mensaje = "" ;
      scmdbuf = "" ;
      P0AOB2_A396EmprCod = new String[] {""} ;
      P0AOB2_A5532Lb_numero = new int[1] ;
      P0AOB2_A5555Lb_opcion = new String[] {""} ;
      P0AOB2_A5558LB_CantC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AOB2_A5557Lb_LineaC = new short[1] ;
      A5558LB_CantC = DecimalUtil.ZERO ;
      P0AOB3_A396EmprCod = new String[] {""} ;
      P0AOB3_A5532Lb_numero = new int[1] ;
      P0AOB3_A5555Lb_opcion = new String[] {""} ;
      P0AOB3_A5561LB_CantP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AOB3_A5560Lb_LineaPr = new short[1] ;
      A5561LB_CantP = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.existenlineasconcantidadacero__default(),
         new Object[] {
             new Object[] {
            P0AOB2_A396EmprCod, P0AOB2_A5532Lb_numero, P0AOB2_A5555Lb_opcion, P0AOB2_A5558LB_CantC, P0AOB2_A5557Lb_LineaC
            }
            , new Object[] {
            P0AOB3_A396EmprCod, P0AOB3_A5532Lb_numero, P0AOB3_A5555Lb_opcion, P0AOB3_A5561LB_CantP, P0AOB3_A5560Lb_LineaPr
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A5557Lb_LineaC ;
   private short A5560Lb_LineaPr ;
   private short Gx_err ;
   private int A5532Lb_numero ;
   private java.math.BigDecimal A5558LB_CantC ;
   private java.math.BigDecimal A5561LB_CantP ;
   private String A396EmprCod ;
   private String A5555Lb_opcion ;
   private String scmdbuf ;
   private String AV9tabla ;
   private String AV8mensaje ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AOB2_A396EmprCod ;
   private int[] P0AOB2_A5532Lb_numero ;
   private String[] P0AOB2_A5555Lb_opcion ;
   private java.math.BigDecimal[] P0AOB2_A5558LB_CantC ;
   private short[] P0AOB2_A5557Lb_LineaC ;
   private String[] P0AOB3_A396EmprCod ;
   private int[] P0AOB3_A5532Lb_numero ;
   private String[] P0AOB3_A5555Lb_opcion ;
   private java.math.BigDecimal[] P0AOB3_A5561LB_CantP ;
   private short[] P0AOB3_A5560Lb_LineaPr ;
}

final  class existenlineasconcantidadacero__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AOB2", "SELECT EmprCod, Lb_numero, Lb_opcion, LB_CantC, Lb_LineaC FROM TXPENS003 WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ? ORDER BY EmprCod, Lb_numero, Lb_opcion, Lb_LineaC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AOB3", "SELECT EmprCod, Lb_numero, Lb_opcion, LB_CantP, Lb_LineaPr FROM TXPENS004 WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ? ORDER BY EmprCod, Lb_numero, Lb_opcion, Lb_LineaPr ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
      }
   }

}

