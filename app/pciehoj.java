package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pciehoj extends GXProcedure
{
   public pciehoj( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pciehoj.class ), "" );
   }

   public pciehoj( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      pciehoj.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pciehoj.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pciehoj.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pciehoj.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pciehoj.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pciehoj.this.AV15Opcion = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17TinEst = (byte)(0) ;
      GXv_int1[0] = AV17TinEst ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINEST", ""), GXv_int1) ;
      pciehoj.this.AV17TinEst = GXv_int1[0] ;
      AV18PLinea = (byte)(0) ;
      GXv_int1[0] = AV18PLinea ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PLINEA", ""), GXv_int1) ;
      pciehoj.this.AV18PLinea = GXv_int1[0] ;
      AV19Artextil = (byte)(0) ;
      GXv_int1[0] = AV19Artextil ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ARTEXT", ""), GXv_int1) ;
      pciehoj.this.AV19Artextil = GXv_int1[0] ;
      AV22Station = context.getWorkstationId( remoteHandle) ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV23EmprNom ;
      GXv_char4[0] = AV24Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV22Station, GXv_char2, GXv_char3, GXv_char4) ;
      pciehoj.this.A396EmprCod = GXv_char2[0] ;
      pciehoj.this.AV23EmprNom = GXv_char3[0] ;
      pciehoj.this.AV24Usurcod = GXv_char4[0] ;
      if ( GXutil.strcmp(AV15Opcion, httpContext.getMessage( "C", "")) == 0 )
      {
         /* Using cursor P00YI2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A213BarSit = P00YI2_A213BarSit[0] ;
            A4400BarSitEst = P00YI2_A4400BarSitEst[0] ;
            n1542BarComPEst = false ;
            /* Optimized UPDATE. */
            /* Using cursor P00YI3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCOM");
            /* End optimized UPDATE. */
            AV21Sit = A213BarSit ;
            if ( AV17TinEst == 0 )
            {
               A213BarSit = (byte)(9) ;
               if ( AV18PLinea == 1 )
               {
                  A4400BarSitEst = (byte)(9) ;
               }
            }
            else
            {
               A213BarSit = (byte)(((A213BarSit==11) ? A213BarSit : 9)) ;
               if ( AV19Artextil == 0 )
               {
                  A4400BarSitEst = (byte)(9) ;
               }
            }
            AV20Texto_i = httpContext.getMessage( "Programa, pCIEHOJ-CAMBIO SITUACION HR= ", "") + GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + GXutil.chr( (short)(13)) ;
            AV20Texto_i += httpContext.getMessage( "Situacion Actual es ", "") + GXutil.str( AV21Sit, 2, 0) + GXutil.chr( (short)(13)) ;
            AV20Texto_i += httpContext.getMessage( "Situacion Final  es ", "") + GXutil.str( A213BarSit, 2, 0) + GXutil.newLine( ) + GXutil.chr( (short)(13)) ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV29Pgmname, AV24Usurcod, AV22Station, AV20Texto_i, A129BarCod, A132BarCodReo, A130BarCodPar) ;
            /* Using cursor P00YI4 */
            pr_default.execute(2, new Object[] {Byte.valueOf(A213BarSit), Byte.valueOf(A4400BarSitEst), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
      }
      else
      {
         AV16Flag = (byte)(1) ;
         /* Using cursor P00YI5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A213BarSit = P00YI5_A213BarSit[0] ;
            A4400BarSitEst = P00YI5_A4400BarSitEst[0] ;
            /* Using cursor P00YI6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A1542BarComPEst = P00YI6_A1542BarComPEst[0] ;
               n1542BarComPEst = P00YI6_n1542BarComPEst[0] ;
               A1032FonCod = P00YI6_A1032FonCod[0] ;
               A1056DisComCod = P00YI6_A1056DisComCod[0] ;
               A2524DisComLin = P00YI6_A2524DisComLin[0] ;
               if ( A1542BarComPEst == 0 )
               {
                  AV16Flag = (byte)(0) ;
               }
               pr_default.readNext(4);
            }
            pr_default.close(4);
            if ( AV16Flag == 1 )
            {
               if ( AV17TinEst == 0 )
               {
                  A213BarSit = (byte)(9) ;
                  if ( AV18PLinea == 1 )
                  {
                     A4400BarSitEst = (byte)(9) ;
                  }
               }
               else
               {
                  A213BarSit = (byte)(9) ;
                  if ( AV19Artextil == 0 )
                  {
                     A4400BarSitEst = (byte)(9) ;
                  }
               }
            }
            /* Using cursor P00YI7 */
            pr_default.execute(5, new Object[] {Byte.valueOf(A213BarSit), Byte.valueOf(A4400BarSitEst), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pciehoj.this.A396EmprCod;
      this.aP1[0] = pciehoj.this.A129BarCod;
      this.aP2[0] = pciehoj.this.A132BarCodReo;
      this.aP3[0] = pciehoj.this.A130BarCodPar;
      this.aP4[0] = pciehoj.this.AV15Opcion;
      Application.commitDataStores(context, remoteHandle, pr_default, "pciehoj");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new byte[1] ;
      AV22Station = "" ;
      GXv_char2 = new String[1] ;
      AV23EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV24Usurcod = "" ;
      GXv_char4 = new String[1] ;
      scmdbuf = "" ;
      P00YI2_A396EmprCod = new String[] {""} ;
      P00YI2_A129BarCod = new int[1] ;
      P00YI2_A132BarCodReo = new byte[1] ;
      P00YI2_A130BarCodPar = new String[] {""} ;
      P00YI2_A213BarSit = new byte[1] ;
      P00YI2_A4400BarSitEst = new byte[1] ;
      AV20Texto_i = "" ;
      AV29Pgmname = "" ;
      P00YI5_A396EmprCod = new String[] {""} ;
      P00YI5_A129BarCod = new int[1] ;
      P00YI5_A132BarCodReo = new byte[1] ;
      P00YI5_A130BarCodPar = new String[] {""} ;
      P00YI5_A213BarSit = new byte[1] ;
      P00YI5_A4400BarSitEst = new byte[1] ;
      P00YI6_A396EmprCod = new String[] {""} ;
      P00YI6_A129BarCod = new int[1] ;
      P00YI6_A132BarCodReo = new byte[1] ;
      P00YI6_A130BarCodPar = new String[] {""} ;
      P00YI6_A1542BarComPEst = new byte[1] ;
      P00YI6_n1542BarComPEst = new boolean[] {false} ;
      P00YI6_A1032FonCod = new String[] {""} ;
      P00YI6_A1056DisComCod = new String[] {""} ;
      P00YI6_A2524DisComLin = new byte[1] ;
      A1032FonCod = "" ;
      A1056DisComCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pciehoj__default(),
         new Object[] {
             new Object[] {
            P00YI2_A396EmprCod, P00YI2_A129BarCod, P00YI2_A132BarCodReo, P00YI2_A130BarCodPar, P00YI2_A213BarSit, P00YI2_A4400BarSitEst
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P00YI5_A396EmprCod, P00YI5_A129BarCod, P00YI5_A132BarCodReo, P00YI5_A130BarCodPar, P00YI5_A213BarSit, P00YI5_A4400BarSitEst
            }
            , new Object[] {
            P00YI6_A396EmprCod, P00YI6_A129BarCod, P00YI6_A132BarCodReo, P00YI6_A130BarCodPar, P00YI6_A1542BarComPEst, P00YI6_n1542BarComPEst, P00YI6_A1032FonCod, P00YI6_A1056DisComCod, P00YI6_A2524DisComLin
            }
            , new Object[] {
            }
         }
      );
      AV29Pgmname = "PCIEHOJ" ;
      /* GeneXus formulas. */
      AV29Pgmname = "PCIEHOJ" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV17TinEst ;
   private byte AV18PLinea ;
   private byte AV19Artextil ;
   private byte GXv_int1[] ;
   private byte A213BarSit ;
   private byte A4400BarSitEst ;
   private byte AV21Sit ;
   private byte AV16Flag ;
   private byte A1542BarComPEst ;
   private byte A2524DisComLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV15Opcion ;
   private String AV22Station ;
   private String GXv_char2[] ;
   private String AV23EmprNom ;
   private String GXv_char3[] ;
   private String AV24Usurcod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String AV29Pgmname ;
   private String A1032FonCod ;
   private String A1056DisComCod ;
   private boolean n1542BarComPEst ;
   private String AV20Texto_i ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P00YI2_A396EmprCod ;
   private int[] P00YI2_A129BarCod ;
   private byte[] P00YI2_A132BarCodReo ;
   private String[] P00YI2_A130BarCodPar ;
   private byte[] P00YI2_A213BarSit ;
   private byte[] P00YI2_A4400BarSitEst ;
   private String[] P00YI5_A396EmprCod ;
   private int[] P00YI5_A129BarCod ;
   private byte[] P00YI5_A132BarCodReo ;
   private String[] P00YI5_A130BarCodPar ;
   private byte[] P00YI5_A213BarSit ;
   private byte[] P00YI5_A4400BarSitEst ;
   private String[] P00YI6_A396EmprCod ;
   private int[] P00YI6_A129BarCod ;
   private byte[] P00YI6_A132BarCodReo ;
   private String[] P00YI6_A130BarCodPar ;
   private byte[] P00YI6_A1542BarComPEst ;
   private boolean[] P00YI6_n1542BarComPEst ;
   private String[] P00YI6_A1032FonCod ;
   private String[] P00YI6_A1056DisComCod ;
   private byte[] P00YI6_A2524DisComLin ;
}

final  class pciehoj__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00YI2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarSit, BarSitEst FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00YI3", "UPDATE TXPBARCOM SET BarComPEst=1  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCOM")
         ,new UpdateCursor("P00YI4", "UPDATE TXPBARCAD SET BarSit=?, BarSitEst=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P00YI5", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarSit, BarSitEst FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00YI6", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarComPEst, FonCod, DisComCod, DisComLin FROM TXPBARCOM WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00YI7", "UPDATE TXPBARCAD SET BarSit=?, BarSitEst=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 12);
               ((String[]) buf[7])[0] = rslt.getString(7, 12);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
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
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 5 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
      }
   }

}

