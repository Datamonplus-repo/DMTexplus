package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc206 extends GXProcedure
{
   public pprc206( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc206.class ), "" );
   }

   public pprc206( int remoteHandle ,
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
      pprc206.this.aP6 = new String[] {""};
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
      pprc206.this.AV8emprcod = aP0[0];
      this.aP0 = aP0;
      pprc206.this.AV9barcod = aP1[0];
      this.aP1 = aP1;
      pprc206.this.AV10barcodreo = aP2[0];
      this.aP2 = aP2;
      pprc206.this.AV11barcodpar = aP3[0];
      this.aP3 = aP3;
      pprc206.this.AV13Maqcod = aP4[0];
      this.aP4 = aP4;
      pprc206.this.AV14Usurcod = aP5[0];
      this.aP5 = aP5;
      pprc206.this.AV15station = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P05T22 */
      pr_default.execute(0, new Object[] {AV8emprcod, Integer.valueOf(AV9barcod), Byte.valueOf(AV10barcodreo), AV11barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P05T22_A130BarCodPar[0] ;
         A132BarCodReo = P05T22_A132BarCodReo[0] ;
         A129BarCod = P05T22_A129BarCod[0] ;
         A396EmprCod = P05T22_A396EmprCod[0] ;
         A180BarMaqCod = P05T22_A180BarMaqCod[0] ;
         A3594BarPriTin = P05T22_A3594BarPriTin[0] ;
         AV16Inc_obs = httpContext.getMessage( "BARCAD.Cambio Maquina ", "") + A180BarMaqCod + httpContext.getMessage( " por ", "") + AV13Maqcod + GXutil.newLine( ) ;
         A180BarMaqCod = AV13Maqcod ;
         A3594BarPriTin = (byte)(80) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV20Pgmname, AV14Usurcod, AV15station, AV16Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         /* Using cursor P05T23 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A150BarFacTin = P05T23_A150BarFacTin[0] ;
            A603MaqCodBis = P05T23_A603MaqCodBis[0] ;
            A194BarOrdLin = P05T23_A194BarOrdLin[0] ;
            A153BarFasEst = P05T23_A153BarFasEst[0] ;
            A758ProCod = P05T23_A758ProCod[0] ;
            if ( GXutil.strcmp(A150BarFacTin, httpContext.getMessage( "S", "")) == 0 )
            {
               AV16Inc_obs = httpContext.getMessage( "BARFAS.UPD Maquina ", "") + A603MaqCodBis + httpContext.getMessage( " por ", "") + AV13Maqcod + GXutil.newLine( ) ;
               AV16Inc_obs += httpContext.getMessage( "Orden ", "") + GXutil.str( A194BarOrdLin, 4, 0) + GXutil.newLine( ) ;
               A603MaqCodBis = ((A153BarFasEst==0) ? AV13Maqcod : A603MaqCodBis) ;
               if ( A153BarFasEst == 0 )
               {
                  new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV20Pgmname, AV14Usurcod, AV15station, AV16Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
               }
               /* Using cursor P05T24 */
               pr_default.execute(2, new Object[] {A603MaqCodBis, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Using cursor P05T25 */
         pr_default.execute(3, new Object[] {A180BarMaqCod, Byte.valueOf(A3594BarPriTin), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprc206.this.AV8emprcod;
      this.aP1[0] = pprc206.this.AV9barcod;
      this.aP2[0] = pprc206.this.AV10barcodreo;
      this.aP3[0] = pprc206.this.AV11barcodpar;
      this.aP4[0] = pprc206.this.AV13Maqcod;
      this.aP5[0] = pprc206.this.AV14Usurcod;
      this.aP6[0] = pprc206.this.AV15station;
      Application.commitDataStores(context, remoteHandle, pr_default, "pprc206");
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
      P05T22_A130BarCodPar = new String[] {""} ;
      P05T22_A132BarCodReo = new byte[1] ;
      P05T22_A129BarCod = new int[1] ;
      P05T22_A396EmprCod = new String[] {""} ;
      P05T22_A180BarMaqCod = new String[] {""} ;
      P05T22_A3594BarPriTin = new byte[1] ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A180BarMaqCod = "" ;
      AV16Inc_obs = "" ;
      AV20Pgmname = "" ;
      P05T23_A396EmprCod = new String[] {""} ;
      P05T23_A129BarCod = new int[1] ;
      P05T23_A132BarCodReo = new byte[1] ;
      P05T23_A130BarCodPar = new String[] {""} ;
      P05T23_A150BarFacTin = new String[] {""} ;
      P05T23_A603MaqCodBis = new String[] {""} ;
      P05T23_A194BarOrdLin = new short[1] ;
      P05T23_A153BarFasEst = new byte[1] ;
      P05T23_A758ProCod = new String[] {""} ;
      A150BarFacTin = "" ;
      A603MaqCodBis = "" ;
      A758ProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprc206__default(),
         new Object[] {
             new Object[] {
            P05T22_A130BarCodPar, P05T22_A132BarCodReo, P05T22_A129BarCod, P05T22_A396EmprCod, P05T22_A180BarMaqCod, P05T22_A3594BarPriTin
            }
            , new Object[] {
            P05T23_A396EmprCod, P05T23_A129BarCod, P05T23_A132BarCodReo, P05T23_A130BarCodPar, P05T23_A150BarFacTin, P05T23_A603MaqCodBis, P05T23_A194BarOrdLin, P05T23_A153BarFasEst, P05T23_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      AV20Pgmname = "PPrc206" ;
      /* GeneXus formulas. */
      AV20Pgmname = "PPrc206" ;
      Gx_err = (short)(0) ;
   }

   private byte AV10barcodreo ;
   private byte A132BarCodReo ;
   private byte A3594BarPriTin ;
   private byte A153BarFasEst ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int AV9barcod ;
   private int A129BarCod ;
   private String AV8emprcod ;
   private String AV11barcodpar ;
   private String AV13Maqcod ;
   private String AV14Usurcod ;
   private String AV15station ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A180BarMaqCod ;
   private String AV20Pgmname ;
   private String A150BarFacTin ;
   private String A603MaqCodBis ;
   private String A758ProCod ;
   private String AV16Inc_obs ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P05T22_A130BarCodPar ;
   private byte[] P05T22_A132BarCodReo ;
   private int[] P05T22_A129BarCod ;
   private String[] P05T22_A396EmprCod ;
   private String[] P05T22_A180BarMaqCod ;
   private byte[] P05T22_A3594BarPriTin ;
   private String[] P05T23_A396EmprCod ;
   private int[] P05T23_A129BarCod ;
   private byte[] P05T23_A132BarCodReo ;
   private String[] P05T23_A130BarCodPar ;
   private String[] P05T23_A150BarFacTin ;
   private String[] P05T23_A603MaqCodBis ;
   private short[] P05T23_A194BarOrdLin ;
   private byte[] P05T23_A153BarFasEst ;
   private String[] P05T23_A758ProCod ;
}

final  class pprc206__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05T22", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarMaqCod, BarPriTin FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05T23", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarFacTin, MaqCodBis, BarOrdLin, BarFasEst, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05T24", "UPDATE TXPBARFAS SET MaqCodBis=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
         ,new UpdateCursor("P05T25", "UPDATE TXPBARCAD SET BarMaqCod=?, BarPriTin=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
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
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 8);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
      }
   }

}

