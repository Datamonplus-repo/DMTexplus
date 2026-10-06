package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class psitesth extends GXProcedure
{
   public psitesth( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( psitesth.class ), "" );
   }

   public psitesth( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      psitesth.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      psitesth.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      psitesth.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      psitesth.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      psitesth.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Num_fases = 0 ;
      AV9Fases_p = 0 ;
      AV10Fases_noi = 0 ;
      AV11Fases_t = 0 ;
      AV13TBarfas = (byte)(0) ;
      /* Using cursor P025H2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4022BarNumBot = P025H2_A4022BarNumBot[0] ;
         A153BarFasEst = P025H2_A153BarFasEst[0] ;
         A758ProCod = P025H2_A758ProCod[0] ;
         A194BarOrdLin = P025H2_A194BarOrdLin[0] ;
         AV13TBarfas = (byte)(1) ;
         if ( A4022BarNumBot == 0 )
         {
            AV10Fases_noi = (int)(AV10Fases_noi+1) ;
         }
         else if ( A4022BarNumBot == 1 )
         {
            AV9Fases_p = (int)(AV9Fases_p+1) ;
         }
         else if ( A4022BarNumBot == 2 )
         {
            AV11Fases_t = (int)(AV11Fases_t+1) ;
         }
         else
         {
         }
         AV8Num_fases = (int)(AV8Num_fases+1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P025H3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A4400BarSitEst = P025H3_A4400BarSitEst[0] ;
         if ( AV13TBarfas == 1 )
         {
            if ( AV8Num_fases == AV10Fases_noi )
            {
               A4400BarSitEst = (byte)(0) ;
            }
            if ( AV11Fases_t == AV8Num_fases )
            {
               A4400BarSitEst = (byte)(2) ;
            }
            if ( ( AV9Fases_p > 0 ) || ( ( AV11Fases_t > 0 ) && ( AV11Fases_t != AV8Num_fases ) ) )
            {
               A4400BarSitEst = (byte)(1) ;
            }
         }
         else
         {
            A4400BarSitEst = (byte)(0) ;
         }
         /* Using cursor P025H4 */
         pr_default.execute(2, new Object[] {Byte.valueOf(A4400BarSitEst), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = psitesth.this.A396EmprCod;
      this.aP1[0] = psitesth.this.A129BarCod;
      this.aP2[0] = psitesth.this.A132BarCodReo;
      this.aP3[0] = psitesth.this.A130BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "psitesth");
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
      P025H2_A396EmprCod = new String[] {""} ;
      P025H2_A129BarCod = new int[1] ;
      P025H2_A132BarCodReo = new byte[1] ;
      P025H2_A130BarCodPar = new String[] {""} ;
      P025H2_A4022BarNumBot = new int[1] ;
      P025H2_A153BarFasEst = new byte[1] ;
      P025H2_A758ProCod = new String[] {""} ;
      P025H2_A194BarOrdLin = new short[1] ;
      A758ProCod = "" ;
      P025H3_A396EmprCod = new String[] {""} ;
      P025H3_A129BarCod = new int[1] ;
      P025H3_A132BarCodReo = new byte[1] ;
      P025H3_A130BarCodPar = new String[] {""} ;
      P025H3_A4400BarSitEst = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.psitesth__default(),
         new Object[] {
             new Object[] {
            P025H2_A396EmprCod, P025H2_A129BarCod, P025H2_A132BarCodReo, P025H2_A130BarCodPar, P025H2_A4022BarNumBot, P025H2_A153BarFasEst, P025H2_A758ProCod, P025H2_A194BarOrdLin
            }
            , new Object[] {
            P025H3_A396EmprCod, P025H3_A129BarCod, P025H3_A132BarCodReo, P025H3_A130BarCodPar, P025H3_A4400BarSitEst
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV13TBarfas ;
   private byte A153BarFasEst ;
   private byte A4400BarSitEst ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV8Num_fases ;
   private int AV9Fases_p ;
   private int AV10Fases_noi ;
   private int AV11Fases_t ;
   private int A4022BarNumBot ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A758ProCod ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P025H2_A396EmprCod ;
   private int[] P025H2_A129BarCod ;
   private byte[] P025H2_A132BarCodReo ;
   private String[] P025H2_A130BarCodPar ;
   private int[] P025H2_A4022BarNumBot ;
   private byte[] P025H2_A153BarFasEst ;
   private String[] P025H2_A758ProCod ;
   private short[] P025H2_A194BarOrdLin ;
   private String[] P025H3_A396EmprCod ;
   private int[] P025H3_A129BarCod ;
   private byte[] P025H3_A132BarCodReo ;
   private String[] P025H3_A130BarCodPar ;
   private byte[] P025H3_A4400BarSitEst ;
}

final  class psitesth__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P025H2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarNumBot, BarFasEst, ProCod, BarOrdLin FROM TXPBARFAS WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarNumBot <= 2) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P025H3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarSitEst FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P025H4", "UPDATE TXPBARCAD SET BarSitEst=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

