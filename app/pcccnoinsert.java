package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcccnoinsert extends GXProcedure
{
   public pcccnoinsert( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcccnoinsert.class ), "" );
   }

   public pcccnoinsert( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           short[] aP2 ,
                           String[] aP3 ,
                           short[] aP4 ,
                           String[] aP5 ,
                           int[] aP6 ,
                           byte[] aP7 ,
                           short[] aP8 ,
                           int[] aP9 ,
                           String[] aP10 )
   {
      pcccnoinsert.this.aP11 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
      return aP11[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        short[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 ,
                        int[] aP6 ,
                        byte[] aP7 ,
                        short[] aP8 ,
                        int[] aP9 ,
                        String[] aP10 ,
                        byte[] aP11 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 ,
                             int[] aP6 ,
                             byte[] aP7 ,
                             short[] aP8 ,
                             int[] aP9 ,
                             String[] aP10 ,
                             byte[] aP11 )
   {
      pcccnoinsert.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcccnoinsert.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pcccnoinsert.this.AV16Tb1_Cod = aP2[0];
      this.aP2 = aP2;
      pcccnoinsert.this.AV11ArtCod = aP3[0];
      this.aP3 = aP3;
      pcccnoinsert.this.AV17TipArtiId = aP4[0];
      this.aP4 = aP4;
      pcccnoinsert.this.AV10CCFColNom = aP5[0];
      this.aP5 = aP5;
      pcccnoinsert.this.AV9CCFColNum = aP6[0];
      this.aP6 = aP6;
      pcccnoinsert.this.AV18CCCtc = aP7[0];
      this.aP7 = aP7;
      pcccnoinsert.this.AV19IntId = aP8[0];
      this.aP8 = aP8;
      pcccnoinsert.this.A4031CCTCod = aP9[0];
      this.aP9 = aP9;
      pcccnoinsert.this.AV15Opc = aP10[0];
      this.aP10 = aP10;
      pcccnoinsert.this.AV8Ok = aP11[0];
      this.aP11 = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Ok = (byte)(1) ;
      AV23GXLvl4 = (byte)(0) ;
      /* Using cursor P04TV2 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         AV23GXLvl4 = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV23GXLvl4 == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No existe Empresa.", ""));
         AV8Ok = (byte)(0) ;
      }
      AV24GXLvl12 = (byte)(0) ;
      /* Using cursor P04TV3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         AV24GXLvl12 = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      if ( AV24GXLvl12 == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No existe Clientes.", ""));
         AV8Ok = (byte)(0) ;
      }
      AV25GXLvl20 = (byte)(0) ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV11ArtCod ,
                                           A65ArtCod ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      /* Using cursor P04TV4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), AV11ArtCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A65ArtCod = P04TV4_A65ArtCod[0] ;
         AV25GXLvl20 = (byte)(1) ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      if ( AV25GXLvl20 == 0 )
      {
         if ( ! (GXutil.strcmp("", A65ArtCod)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "No existe Artículos.", ""));
            AV8Ok = (byte)(0) ;
         }
      }
      AV26GXLvl31 = (byte)(0) ;
      /* Using cursor P04TV5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         AV26GXLvl31 = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      if ( AV26GXLvl31 == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No existe Control de Calidad Tipo.", ""));
         AV8Ok = (byte)(0) ;
      }
      if ( AV8Ok == 1 )
      {
         AV12ForSer = AV11ArtCod ;
         AV13ForColNom = AV10CCFColNom ;
         AV14ForColNum = AV9CCFColNum ;
         /* Execute user subroutine: 'NEW' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'NEW' Routine */
      returnInSub = false ;
      /* Using cursor P04TV6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         W396EmprCod = A396EmprCod ;
         W4031CCTCod = A4031CCTCod ;
         /* Using cursor P04TV7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A13249CCVNorma = P04TV7_A13249CCVNorma[0] ;
            A13250CCVEspecif = P04TV7_A13250CCVEspecif[0] ;
            A4034CCTLin = P04TV7_A4034CCTLin[0] ;
            W396EmprCod = A396EmprCod ;
            W4031CCTCod = A4031CCTCod ;
            /*
               INSERT RECORD ON TABLE TXPCCCNOS

            */
            W396EmprCod = A396EmprCod ;
            W4031CCTCod = A4031CCTCod ;
            W4034CCTLin = A4034CCTLin ;
            A9713Tb1_Cod = AV16Tb1_Cod ;
            A11736CCArtCod = AV12ForSer ;
            A11748TipArtiId = AV17TipArtiId ;
            A11737CCColNom = AV13ForColNom ;
            A11738CCColNum = AV14ForColNum ;
            A11749CCCTc = AV18CCCtc ;
            A11750IntId = AV19IntId ;
            A11742CCSCAut = (byte)(0) ;
            n11742CCSCAut = false ;
            A11740CCSCMn = " " ;
            n11740CCSCMn = false ;
            A11741CCSCMx = " " ;
            n11741CCSCMx = false ;
            A11744CCSCTol = DecimalUtil.doubleToDec(0) ;
            n11744CCSCTol = false ;
            A11739CCSCVal = " " ;
            n11739CCSCVal = false ;
            A11743CCSCVar = " " ;
            n11743CCSCVar = false ;
            A11751CCSCNorma = A13249CCVNorma ;
            n11751CCSCNorma = false ;
            A11755CCSCCEns = A13250CCVEspecif ;
            n11755CCSCCEns = false ;
            A11752CCSCObs = " " ;
            n11752CCSCObs = false ;
            /* Using cursor P04TV8 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId), A11737CCColNom, Integer.valueOf(A11738CCColNum), Byte.valueOf(A11749CCCTc), Short.valueOf(A11750IntId), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), Boolean.valueOf(n11739CCSCVal), A11739CCSCVal, Boolean.valueOf(n11740CCSCMn), A11740CCSCMn, Boolean.valueOf(n11741CCSCMx), A11741CCSCMx, Boolean.valueOf(n11742CCSCAut), Byte.valueOf(A11742CCSCAut), Boolean.valueOf(n11743CCSCVar), A11743CCSCVar, Boolean.valueOf(n11744CCSCTol), A11744CCSCTol, Boolean.valueOf(n11751CCSCNorma), A11751CCSCNorma, Boolean.valueOf(n11752CCSCObs), A11752CCSCObs, Boolean.valueOf(n11755CCSCCEns), A11755CCSCCEns});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCCNOS");
            if ( (pr_default.getStatus(6) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            A396EmprCod = W396EmprCod ;
            A4031CCTCod = W4031CCTCod ;
            A4034CCTLin = W4034CCTLin ;
            /* End Insert */
            A396EmprCod = W396EmprCod ;
            A4031CCTCod = W4031CCTCod ;
            pr_default.readNext(5);
         }
         pr_default.close(5);
         A396EmprCod = W396EmprCod ;
         A4031CCTCod = W4031CCTCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcccnoinsert.this.A396EmprCod;
      this.aP1[0] = pcccnoinsert.this.A252CliCod;
      this.aP2[0] = pcccnoinsert.this.AV16Tb1_Cod;
      this.aP3[0] = pcccnoinsert.this.AV11ArtCod;
      this.aP4[0] = pcccnoinsert.this.AV17TipArtiId;
      this.aP5[0] = pcccnoinsert.this.AV10CCFColNom;
      this.aP6[0] = pcccnoinsert.this.AV9CCFColNum;
      this.aP7[0] = pcccnoinsert.this.AV18CCCtc;
      this.aP8[0] = pcccnoinsert.this.AV19IntId;
      this.aP9[0] = pcccnoinsert.this.A4031CCTCod;
      this.aP10[0] = pcccnoinsert.this.AV15Opc;
      this.aP11[0] = pcccnoinsert.this.AV8Ok;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcccnoinsert");
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
      P04TV2_A396EmprCod = new String[] {""} ;
      P04TV3_A396EmprCod = new String[] {""} ;
      P04TV3_A252CliCod = new int[1] ;
      A65ArtCod = "" ;
      P04TV4_A396EmprCod = new String[] {""} ;
      P04TV4_A252CliCod = new int[1] ;
      P04TV4_A65ArtCod = new String[] {""} ;
      P04TV5_A396EmprCod = new String[] {""} ;
      P04TV5_A4031CCTCod = new int[1] ;
      AV12ForSer = "" ;
      AV13ForColNom = "" ;
      P04TV6_A396EmprCod = new String[] {""} ;
      P04TV6_A4031CCTCod = new int[1] ;
      W396EmprCod = "" ;
      P04TV7_A396EmprCod = new String[] {""} ;
      P04TV7_A4031CCTCod = new int[1] ;
      P04TV7_A13249CCVNorma = new String[] {""} ;
      P04TV7_A13250CCVEspecif = new String[] {""} ;
      P04TV7_A4034CCTLin = new short[1] ;
      A13249CCVNorma = "" ;
      A13250CCVEspecif = "" ;
      A11736CCArtCod = "" ;
      A11737CCColNom = "" ;
      A11740CCSCMn = "" ;
      A11741CCSCMx = "" ;
      A11744CCSCTol = DecimalUtil.ZERO ;
      A11739CCSCVal = "" ;
      A11743CCSCVar = "" ;
      A11751CCSCNorma = "" ;
      A11755CCSCCEns = "" ;
      A11752CCSCObs = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcccnoinsert__default(),
         new Object[] {
             new Object[] {
            P04TV2_A396EmprCod
            }
            , new Object[] {
            P04TV3_A396EmprCod, P04TV3_A252CliCod
            }
            , new Object[] {
            P04TV4_A396EmprCod, P04TV4_A252CliCod, P04TV4_A65ArtCod
            }
            , new Object[] {
            P04TV5_A396EmprCod, P04TV5_A4031CCTCod
            }
            , new Object[] {
            P04TV6_A396EmprCod, P04TV6_A4031CCTCod
            }
            , new Object[] {
            P04TV7_A396EmprCod, P04TV7_A4031CCTCod, P04TV7_A13249CCVNorma, P04TV7_A13250CCVEspecif, P04TV7_A4034CCTLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV18CCCtc ;
   private byte AV8Ok ;
   private byte AV23GXLvl4 ;
   private byte AV24GXLvl12 ;
   private byte AV25GXLvl20 ;
   private byte AV26GXLvl31 ;
   private byte A11749CCCTc ;
   private byte A11742CCSCAut ;
   private short AV16Tb1_Cod ;
   private short AV17TipArtiId ;
   private short AV19IntId ;
   private short A4034CCTLin ;
   private short W4034CCTLin ;
   private short A9713Tb1_Cod ;
   private short A11748TipArtiId ;
   private short A11750IntId ;
   private short Gx_err ;
   private int A252CliCod ;
   private int AV9CCFColNum ;
   private int A4031CCTCod ;
   private int AV14ForColNum ;
   private int W4031CCTCod ;
   private int GX_INS1652 ;
   private int A11738CCColNum ;
   private java.math.BigDecimal A11744CCSCTol ;
   private String A396EmprCod ;
   private String AV11ArtCod ;
   private String AV10CCFColNom ;
   private String AV15Opc ;
   private String scmdbuf ;
   private String A65ArtCod ;
   private String AV12ForSer ;
   private String AV13ForColNom ;
   private String W396EmprCod ;
   private String A13249CCVNorma ;
   private String A13250CCVEspecif ;
   private String A11736CCArtCod ;
   private String A11737CCColNom ;
   private String A11740CCSCMn ;
   private String A11741CCSCMx ;
   private String A11739CCSCVal ;
   private String A11743CCSCVar ;
   private String A11751CCSCNorma ;
   private String A11755CCSCCEns ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private boolean n11742CCSCAut ;
   private boolean n11740CCSCMn ;
   private boolean n11741CCSCMx ;
   private boolean n11744CCSCTol ;
   private boolean n11739CCSCVal ;
   private boolean n11743CCSCVar ;
   private boolean n11751CCSCNorma ;
   private boolean n11755CCSCCEns ;
   private boolean n11752CCSCObs ;
   private String A11752CCSCObs ;
   private byte[] aP11 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private short[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private int[] aP6 ;
   private byte[] aP7 ;
   private short[] aP8 ;
   private int[] aP9 ;
   private String[] aP10 ;
   private IDataStoreProvider pr_default ;
   private String[] P04TV2_A396EmprCod ;
   private String[] P04TV3_A396EmprCod ;
   private int[] P04TV3_A252CliCod ;
   private String[] P04TV4_A396EmprCod ;
   private int[] P04TV4_A252CliCod ;
   private String[] P04TV4_A65ArtCod ;
   private String[] P04TV5_A396EmprCod ;
   private int[] P04TV5_A4031CCTCod ;
   private String[] P04TV6_A396EmprCod ;
   private int[] P04TV6_A4031CCTCod ;
   private String[] P04TV7_A396EmprCod ;
   private int[] P04TV7_A4031CCTCod ;
   private String[] P04TV7_A13249CCVNorma ;
   private String[] P04TV7_A13250CCVEspecif ;
   private short[] P04TV7_A4034CCTLin ;
}

final  class pcccnoinsert__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P04TV4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV11ArtCod ,
                                          String A65ArtCod ,
                                          String A396EmprCod ,
                                          int A252CliCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[3];
      Object[] GXv_Object2 = new Object[2];
      scmdbuf = "SELECT EmprCod, CliCod, ArtCod FROM TXPARTICU" ;
      addWhere(sWhereString, "(EmprCod = ? and CliCod = ?)");
      if ( ! (GXutil.strcmp("", AV11ArtCod)==0) )
      {
         addWhere(sWhereString, "(ArtCod = ?)");
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, CliCod, ArtCod" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 2 :
                  return conditional_P04TV4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04TV2", "SELECT EmprCod FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04TV3", "SELECT EmprCod, CliCod FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04TV4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04TV5", "SELECT EmprCod, CCTCod FROM TXPCCDef WHERE EmprCod = ? and CCTCod = ? ORDER BY EmprCod, CCTCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04TV6", "SELECT EmprCod, CCTCod FROM TXPCCDef WHERE EmprCod = ? and CCTCod = ? ORDER BY EmprCod, CCTCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04TV7", "SELECT EmprCod, CCTCod, CCVNorma, CCVEspecif, CCTLin FROM TXPCCDef1 WHERE EmprCod = ? and CCTCod = ? ORDER BY EmprCod, CCTCod, CCTLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04TV8", "INSERT INTO TXPCCCNOS(EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId, CCTCod, CCTLin, CCSCVal, CCSCMn, CCSCMx, CCSCAut, CCSCVar, CCSCTol, CCSCNorma, CCSCObs, CCSCCEns, CCSCPmm, CCSCObs2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCCNOS")
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[3], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[4]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[5], 16);
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 13);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[12], 40);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[14], 40);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[16], 40);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(15, ((Number) parms[18]).byteValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[20], 10);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(17, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[24], 40);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[26], 600);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[28], 100);
               }
               return;
      }
   }

}

