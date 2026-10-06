package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc107 extends GXProcedure
{
   public pprc107( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc107.class ), "" );
   }

   public pprc107( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      pprc107.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      pprc107.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprc107.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pprc107.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pprc107.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pprc107.this.AV8Maqcodbis = aP4[0];
      this.aP4 = aP4;
      pprc107.this.AV9Usurcod = aP5[0];
      this.aP5 = aP5;
      pprc107.this.AV10station = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P05IN2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A153BarFasEst = P05IN2_A153BarFasEst[0] ;
         A150BarFacTin = P05IN2_A150BarFacTin[0] ;
         A460FasDsc = P05IN2_A460FasDsc[0] ;
         A457FasCod = P05IN2_A457FasCod[0] ;
         A603MaqCodBis = P05IN2_A603MaqCodBis[0] ;
         A194BarOrdLin = P05IN2_A194BarOrdLin[0] ;
         A758ProCod = P05IN2_A758ProCod[0] ;
         A460FasDsc = P05IN2_A460FasDsc[0] ;
         if ( GXutil.strcmp(A150BarFacTin, httpContext.getMessage( "S", "")) == 0 )
         {
            AV11Inc_obs = httpContext.getMessage( "Cambio Maquina en BARFAS", "") + GXutil.newLine( ) ;
            AV11Inc_obs += httpContext.getMessage( "Orden   ", "") + GXutil.str( A194BarOrdLin, 4, 0) + httpContext.getMessage( " Fase ", "") + A457FasCod + " " + GXutil.trim( A460FasDsc) + GXutil.newLine( ) ;
            AV11Inc_obs += httpContext.getMessage( "Maquina ", "") + GXutil.trim( A603MaqCodBis) + httpContext.getMessage( " se cambia por ", "") + AV8Maqcodbis ;
            A603MaqCodBis = AV8Maqcodbis ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV15Pgmname, AV9Usurcod, AV10station, AV11Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
            /* Using cursor P05IN3 */
            pr_default.execute(1, new Object[] {A603MaqCodBis, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprc107.this.A396EmprCod;
      this.aP1[0] = pprc107.this.A129BarCod;
      this.aP2[0] = pprc107.this.A132BarCodReo;
      this.aP3[0] = pprc107.this.A130BarCodPar;
      this.aP4[0] = pprc107.this.AV8Maqcodbis;
      this.aP5[0] = pprc107.this.AV9Usurcod;
      this.aP6[0] = pprc107.this.AV10station;
      Application.commitDataStores(context, remoteHandle, pr_default, "pprc107");
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
      P05IN2_A396EmprCod = new String[] {""} ;
      P05IN2_A129BarCod = new int[1] ;
      P05IN2_A132BarCodReo = new byte[1] ;
      P05IN2_A130BarCodPar = new String[] {""} ;
      P05IN2_A153BarFasEst = new byte[1] ;
      P05IN2_A150BarFacTin = new String[] {""} ;
      P05IN2_A460FasDsc = new String[] {""} ;
      P05IN2_A457FasCod = new String[] {""} ;
      P05IN2_A603MaqCodBis = new String[] {""} ;
      P05IN2_A194BarOrdLin = new short[1] ;
      P05IN2_A758ProCod = new String[] {""} ;
      A150BarFacTin = "" ;
      A460FasDsc = "" ;
      A457FasCod = "" ;
      A603MaqCodBis = "" ;
      A758ProCod = "" ;
      AV11Inc_obs = "" ;
      AV15Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprc107__default(),
         new Object[] {
             new Object[] {
            P05IN2_A396EmprCod, P05IN2_A129BarCod, P05IN2_A132BarCodReo, P05IN2_A130BarCodPar, P05IN2_A153BarFasEst, P05IN2_A150BarFacTin, P05IN2_A460FasDsc, P05IN2_A457FasCod, P05IN2_A603MaqCodBis, P05IN2_A194BarOrdLin,
            P05IN2_A758ProCod
            }
            , new Object[] {
            }
         }
      );
      AV15Pgmname = "PPrc107" ;
      /* GeneXus formulas. */
      AV15Pgmname = "PPrc107" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A153BarFasEst ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV8Maqcodbis ;
   private String AV9Usurcod ;
   private String AV10station ;
   private String scmdbuf ;
   private String A150BarFacTin ;
   private String A460FasDsc ;
   private String A457FasCod ;
   private String A603MaqCodBis ;
   private String A758ProCod ;
   private String AV15Pgmname ;
   private String AV11Inc_obs ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P05IN2_A396EmprCod ;
   private int[] P05IN2_A129BarCod ;
   private byte[] P05IN2_A132BarCodReo ;
   private String[] P05IN2_A130BarCodPar ;
   private byte[] P05IN2_A153BarFasEst ;
   private String[] P05IN2_A150BarFacTin ;
   private String[] P05IN2_A460FasDsc ;
   private String[] P05IN2_A457FasCod ;
   private String[] P05IN2_A603MaqCodBis ;
   private short[] P05IN2_A194BarOrdLin ;
   private String[] P05IN2_A758ProCod ;
}

final  class pprc107__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05IN2", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFasEst, T1.BarFacTin, T2.FasDsc, T1.FasCod, T1.MaqCodBis, T1.BarOrdLin, T1.ProCod FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?) AND (T1.BarFasEst = 0) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05IN3", "UPDATE TXPBARFAS SET MaqCodBis=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
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
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 28);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 8);
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
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 8);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
      }
   }

}

