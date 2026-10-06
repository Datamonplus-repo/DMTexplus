package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pinduyco extends GXProcedure
{
   public pinduyco( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pinduyco.class ), "" );
   }

   public pinduyco( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          byte[] aP2 ,
                          String[] aP3 ,
                          String[] aP4 ,
                          String[] aP5 )
   {
      pinduyco.this.aP6 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        int[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             int[] aP6 )
   {
      pinduyco.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pinduyco.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pinduyco.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pinduyco.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pinduyco.this.AV10usurcod = aP4[0];
      this.aP4 = aP4;
      pinduyco.this.AV11Station = aP5[0];
      this.aP5 = aP5;
      pinduyco.this.AV9Albcomcod = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01YD2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3030BarPlf = P01YD2_A3030BarPlf[0] ;
         A3030BarPlf = httpContext.getMessage( "N", "") ;
         AV8Texto_i = httpContext.getMessage( "TALBCOM-MANTENIMIENTO ALBARAN COMERCIAL", "") + GXutil.chr( (short)(13)) ;
         AV8Texto_i += httpContext.getMessage( "ELIMINACION ALBARAN TIPO EN DEPOSITO ", "") + GXutil.str( AV9Albcomcod, 8, 0) + GXutil.chr( (short)(13)) ;
         AV8Texto_i += httpContext.getMessage( "HDR ", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + httpContext.getMessage( "pasa de S a N->", "") + A3030BarPlf + GXutil.chr( (short)(13)) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TALBCOM", ""), AV10usurcod, AV11Station, AV8Texto_i, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         /* Using cursor P01YD3 */
         pr_default.execute(1, new Object[] {A3030BarPlf, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pinduyco.this.A396EmprCod;
      this.aP1[0] = pinduyco.this.A129BarCod;
      this.aP2[0] = pinduyco.this.A132BarCodReo;
      this.aP3[0] = pinduyco.this.A130BarCodPar;
      this.aP4[0] = pinduyco.this.AV10usurcod;
      this.aP5[0] = pinduyco.this.AV11Station;
      this.aP6[0] = pinduyco.this.AV9Albcomcod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pinduyco");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P01YD2_A396EmprCod = new String[] {""} ;
      P01YD2_A129BarCod = new int[1] ;
      P01YD2_A132BarCodReo = new byte[1] ;
      P01YD2_A130BarCodPar = new String[] {""} ;
      P01YD2_A3030BarPlf = new String[] {""} ;
      A3030BarPlf = "" ;
      AV8Texto_i = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pinduyco__default(),
         new Object[] {
             new Object[] {
            P01YD2_A396EmprCod, P01YD2_A129BarCod, P01YD2_A132BarCodReo, P01YD2_A130BarCodPar, P01YD2_A3030BarPlf
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV9Albcomcod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV10usurcod ;
   private String AV11Station ;
   private String scmdbuf ;
   private String A3030BarPlf ;
   private String AV8Texto_i ;
   private int[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P01YD2_A396EmprCod ;
   private int[] P01YD2_A129BarCod ;
   private byte[] P01YD2_A132BarCodReo ;
   private String[] P01YD2_A130BarCodPar ;
   private String[] P01YD2_A3030BarPlf ;
}

final  class pinduyco__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01YD2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPlf FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01YD3", "UPDATE TXPBARCAD SET BarPlf=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

