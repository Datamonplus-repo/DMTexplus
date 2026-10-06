package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pduppref extends GXProcedure
{
   public pduppref( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pduppref.class ), "" );
   }

   public pduppref( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 )
   {
      pduppref.this.aP2 = new int[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 )
   {
      pduppref.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pduppref.this.AV8CliOri = aP1[0];
      this.aP1 = aP1;
      pduppref.this.AV9CliDes = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P039K2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8CliOri)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P039K2_A252CliCod[0] ;
         A14258FasFactura = P039K2_A14258FasFactura[0] ;
         A13587FasKgsEnt = P039K2_A13587FasKgsEnt[0] ;
         n13587FasKgsEnt = P039K2_n13587FasKgsEnt[0] ;
         A12704FasKgsMn = P039K2_A12704FasKgsMn[0] ;
         n12704FasKgsMn = P039K2_n12704FasKgsMn[0] ;
         A12577FasPreKgF = P039K2_A12577FasPreKgF[0] ;
         n12577FasPreKgF = P039K2_n12577FasPreKgF[0] ;
         A12576FasPreMt2 = P039K2_A12576FasPreMt2[0] ;
         n12576FasPreMt2 = P039K2_n12576FasPreMt2[0] ;
         A10882FasPreU = P039K2_A10882FasPreU[0] ;
         n10882FasPreU = P039K2_n10882FasPreU[0] ;
         A5514ClifsiUl = P039K2_A5514ClifsiUl[0] ;
         n5514ClifsiUl = P039K2_n5514ClifsiUl[0] ;
         A5518ClifsdUl = P039K2_A5518ClifsdUl[0] ;
         n5518ClifsdUl = P039K2_n5518ClifsdUl[0] ;
         A4388FasPreFAn = P039K2_A4388FasPreFAn[0] ;
         n4388FasPreFAn = P039K2_n4388FasPreFAn[0] ;
         A4387FasPreMAn = P039K2_A4387FasPreMAn[0] ;
         n4387FasPreMAn = P039K2_n4387FasPreMAn[0] ;
         A4386FasPreKAn = P039K2_A4386FasPreKAn[0] ;
         n4386FasPreKAn = P039K2_n4386FasPreKAn[0] ;
         A4385FasPreFAc = P039K2_A4385FasPreFAc[0] ;
         n4385FasPreFAc = P039K2_n4385FasPreFAc[0] ;
         A3615FasFacCod = P039K2_A3615FasFacCod[0] ;
         n3615FasFacCod = P039K2_n3615FasFacCod[0] ;
         A470FasSumTin = P039K2_A470FasSumTin[0] ;
         n470FasSumTin = P039K2_n470FasSumTin[0] ;
         A466FasPreKgm = P039K2_A466FasPreKgm[0] ;
         n466FasPreKgm = P039K2_n466FasPreKgm[0] ;
         A467FasPreMtr = P039K2_A467FasPreMtr[0] ;
         n467FasPreMtr = P039K2_n467FasPreMtr[0] ;
         A457FasCod = P039K2_A457FasCod[0] ;
         A14042FasActiva = P039K2_A14042FasActiva[0] ;
         A14042FasActiva = P039K2_A14042FasActiva[0] ;
         W252CliCod = A252CliCod ;
         /*
            INSERT RECORD ON TABLE TXPPREFAS

         */
         W457FasCod = A457FasCod ;
         W252CliCod = A252CliCod ;
         A252CliCod = AV9CliDes ;
         /* Using cursor P039K3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A457FasCod, Boolean.valueOf(n467FasPreMtr), A467FasPreMtr, Boolean.valueOf(n466FasPreKgm), A466FasPreKgm, Boolean.valueOf(n470FasSumTin), A470FasSumTin, Boolean.valueOf(n3615FasFacCod), A3615FasFacCod, Boolean.valueOf(n4385FasPreFAc), A4385FasPreFAc, Boolean.valueOf(n4386FasPreKAn), A4386FasPreKAn, Boolean.valueOf(n4387FasPreMAn), A4387FasPreMAn, Boolean.valueOf(n4388FasPreFAn), A4388FasPreFAn, Boolean.valueOf(n5518ClifsdUl), Short.valueOf(A5518ClifsdUl), Boolean.valueOf(n5514ClifsiUl), Short.valueOf(A5514ClifsiUl), Boolean.valueOf(n10882FasPreU), Byte.valueOf(A10882FasPreU), Boolean.valueOf(n12576FasPreMt2), A12576FasPreMt2, Boolean.valueOf(n12577FasPreKgF), A12577FasPreKgF, Boolean.valueOf(n12704FasKgsMn), A12704FasKgsMn, Boolean.valueOf(n13587FasKgsEnt), A13587FasKgsEnt, A14258FasFactura});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPREFAS");
         if ( (pr_default.getStatus(1) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A457FasCod = W457FasCod ;
         A252CliCod = W252CliCod ;
         /* End Insert */
         /* Using cursor P039K4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A457FasCod});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A8507PFATip = P039K4_A8507PFATip[0] ;
            n8507PFATip = P039K4_n8507PFATip[0] ;
            A8506PFAPre = P039K4_A8506PFAPre[0] ;
            n8506PFAPre = P039K4_n8506PFAPre[0] ;
            A7727ArtAdiCod = P039K4_A7727ArtAdiCod[0] ;
            W252CliCod = A252CliCod ;
            W457FasCod = A457FasCod ;
            /*
               INSERT RECORD ON TABLE TXPARTPFA

            */
            W7727ArtAdiCod = A7727ArtAdiCod ;
            W457FasCod = A457FasCod ;
            W252CliCod = A252CliCod ;
            A252CliCod = AV9CliDes ;
            /* Using cursor P039K5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A457FasCod, Short.valueOf(A7727ArtAdiCod), Boolean.valueOf(n8506PFAPre), A8506PFAPre, Boolean.valueOf(n8507PFATip), A8507PFATip});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTPFA");
            if ( (pr_default.getStatus(3) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            A7727ArtAdiCod = W7727ArtAdiCod ;
            A457FasCod = W457FasCod ;
            A252CliCod = W252CliCod ;
            /* End Insert */
            A252CliCod = W252CliCod ;
            A457FasCod = W457FasCod ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         A252CliCod = W252CliCod ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pduppref.this.A396EmprCod;
      this.aP1[0] = pduppref.this.AV8CliOri;
      this.aP2[0] = pduppref.this.AV9CliDes;
      Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.pduppref");
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
      P039K2_A396EmprCod = new String[] {""} ;
      P039K2_A252CliCod = new int[1] ;
      P039K2_A14258FasFactura = new String[] {""} ;
      P039K2_A13587FasKgsEnt = new String[] {""} ;
      P039K2_n13587FasKgsEnt = new boolean[] {false} ;
      P039K2_A12704FasKgsMn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P039K2_n12704FasKgsMn = new boolean[] {false} ;
      P039K2_A12577FasPreKgF = new String[] {""} ;
      P039K2_n12577FasPreKgF = new boolean[] {false} ;
      P039K2_A12576FasPreMt2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P039K2_n12576FasPreMt2 = new boolean[] {false} ;
      P039K2_A10882FasPreU = new byte[1] ;
      P039K2_n10882FasPreU = new boolean[] {false} ;
      P039K2_A5514ClifsiUl = new short[1] ;
      P039K2_n5514ClifsiUl = new boolean[] {false} ;
      P039K2_A5518ClifsdUl = new short[1] ;
      P039K2_n5518ClifsdUl = new boolean[] {false} ;
      P039K2_A4388FasPreFAn = new java.util.Date[] {GXutil.nullDate()} ;
      P039K2_n4388FasPreFAn = new boolean[] {false} ;
      P039K2_A4387FasPreMAn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P039K2_n4387FasPreMAn = new boolean[] {false} ;
      P039K2_A4386FasPreKAn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P039K2_n4386FasPreKAn = new boolean[] {false} ;
      P039K2_A4385FasPreFAc = new java.util.Date[] {GXutil.nullDate()} ;
      P039K2_n4385FasPreFAc = new boolean[] {false} ;
      P039K2_A3615FasFacCod = new String[] {""} ;
      P039K2_n3615FasFacCod = new boolean[] {false} ;
      P039K2_A470FasSumTin = new String[] {""} ;
      P039K2_n470FasSumTin = new boolean[] {false} ;
      P039K2_A466FasPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P039K2_n466FasPreKgm = new boolean[] {false} ;
      P039K2_A467FasPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P039K2_n467FasPreMtr = new boolean[] {false} ;
      P039K2_A457FasCod = new String[] {""} ;
      P039K2_A14042FasActiva = new String[] {""} ;
      A14258FasFactura = "" ;
      A13587FasKgsEnt = "" ;
      A12704FasKgsMn = DecimalUtil.ZERO ;
      A12577FasPreKgF = "" ;
      A12576FasPreMt2 = DecimalUtil.ZERO ;
      A4388FasPreFAn = GXutil.nullDate() ;
      A4387FasPreMAn = DecimalUtil.ZERO ;
      A4386FasPreKAn = DecimalUtil.ZERO ;
      A4385FasPreFAc = GXutil.nullDate() ;
      A3615FasFacCod = "" ;
      A470FasSumTin = "" ;
      A466FasPreKgm = DecimalUtil.ZERO ;
      A467FasPreMtr = DecimalUtil.ZERO ;
      A457FasCod = "" ;
      A14042FasActiva = "" ;
      W457FasCod = "" ;
      Gx_emsg = "" ;
      P039K4_A396EmprCod = new String[] {""} ;
      P039K4_A252CliCod = new int[1] ;
      P039K4_A457FasCod = new String[] {""} ;
      P039K4_A8507PFATip = new String[] {""} ;
      P039K4_n8507PFATip = new boolean[] {false} ;
      P039K4_A8506PFAPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P039K4_n8506PFAPre = new boolean[] {false} ;
      P039K4_A7727ArtAdiCod = new short[1] ;
      A8507PFATip = "" ;
      A8506PFAPre = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.pduppref__default(),
         new Object[] {
             new Object[] {
            P039K2_A396EmprCod, P039K2_A252CliCod, P039K2_A14258FasFactura, P039K2_A13587FasKgsEnt, P039K2_n13587FasKgsEnt, P039K2_A12704FasKgsMn, P039K2_n12704FasKgsMn, P039K2_A12577FasPreKgF, P039K2_n12577FasPreKgF, P039K2_A12576FasPreMt2,
            P039K2_n12576FasPreMt2, P039K2_A10882FasPreU, P039K2_n10882FasPreU, P039K2_A5514ClifsiUl, P039K2_n5514ClifsiUl, P039K2_A5518ClifsdUl, P039K2_n5518ClifsdUl, P039K2_A4388FasPreFAn, P039K2_n4388FasPreFAn, P039K2_A4387FasPreMAn,
            P039K2_n4387FasPreMAn, P039K2_A4386FasPreKAn, P039K2_n4386FasPreKAn, P039K2_A4385FasPreFAc, P039K2_n4385FasPreFAc, P039K2_A3615FasFacCod, P039K2_n3615FasFacCod, P039K2_A470FasSumTin, P039K2_n470FasSumTin, P039K2_A466FasPreKgm,
            P039K2_n466FasPreKgm, P039K2_A467FasPreMtr, P039K2_n467FasPreMtr, P039K2_A457FasCod, P039K2_A14042FasActiva
            }
            , new Object[] {
            }
            , new Object[] {
            P039K4_A396EmprCod, P039K4_A252CliCod, P039K4_A457FasCod, P039K4_A8507PFATip, P039K4_n8507PFATip, P039K4_A8506PFAPre, P039K4_n8506PFAPre, P039K4_A7727ArtAdiCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A10882FasPreU ;
   private short A5514ClifsiUl ;
   private short A5518ClifsdUl ;
   private short Gx_err ;
   private short A7727ArtAdiCod ;
   private short W7727ArtAdiCod ;
   private int AV8CliOri ;
   private int AV9CliDes ;
   private int A252CliCod ;
   private int W252CliCod ;
   private int GX_INS85 ;
   private int GX_INS1167 ;
   private java.math.BigDecimal A12704FasKgsMn ;
   private java.math.BigDecimal A12576FasPreMt2 ;
   private java.math.BigDecimal A4387FasPreMAn ;
   private java.math.BigDecimal A4386FasPreKAn ;
   private java.math.BigDecimal A466FasPreKgm ;
   private java.math.BigDecimal A467FasPreMtr ;
   private java.math.BigDecimal A8506PFAPre ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A14258FasFactura ;
   private String A13587FasKgsEnt ;
   private String A12577FasPreKgF ;
   private String A3615FasFacCod ;
   private String A470FasSumTin ;
   private String A457FasCod ;
   private String A14042FasActiva ;
   private String W457FasCod ;
   private String Gx_emsg ;
   private String A8507PFATip ;
   private java.util.Date A4388FasPreFAn ;
   private java.util.Date A4385FasPreFAc ;
   private boolean n13587FasKgsEnt ;
   private boolean n12704FasKgsMn ;
   private boolean n12577FasPreKgF ;
   private boolean n12576FasPreMt2 ;
   private boolean n10882FasPreU ;
   private boolean n5514ClifsiUl ;
   private boolean n5518ClifsdUl ;
   private boolean n4388FasPreFAn ;
   private boolean n4387FasPreMAn ;
   private boolean n4386FasPreKAn ;
   private boolean n4385FasPreFAc ;
   private boolean n3615FasFacCod ;
   private boolean n470FasSumTin ;
   private boolean n466FasPreKgm ;
   private boolean n467FasPreMtr ;
   private boolean n8507PFATip ;
   private boolean n8506PFAPre ;
   private int[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P039K2_A396EmprCod ;
   private int[] P039K2_A252CliCod ;
   private String[] P039K2_A14258FasFactura ;
   private String[] P039K2_A13587FasKgsEnt ;
   private boolean[] P039K2_n13587FasKgsEnt ;
   private java.math.BigDecimal[] P039K2_A12704FasKgsMn ;
   private boolean[] P039K2_n12704FasKgsMn ;
   private String[] P039K2_A12577FasPreKgF ;
   private boolean[] P039K2_n12577FasPreKgF ;
   private java.math.BigDecimal[] P039K2_A12576FasPreMt2 ;
   private boolean[] P039K2_n12576FasPreMt2 ;
   private byte[] P039K2_A10882FasPreU ;
   private boolean[] P039K2_n10882FasPreU ;
   private short[] P039K2_A5514ClifsiUl ;
   private boolean[] P039K2_n5514ClifsiUl ;
   private short[] P039K2_A5518ClifsdUl ;
   private boolean[] P039K2_n5518ClifsdUl ;
   private java.util.Date[] P039K2_A4388FasPreFAn ;
   private boolean[] P039K2_n4388FasPreFAn ;
   private java.math.BigDecimal[] P039K2_A4387FasPreMAn ;
   private boolean[] P039K2_n4387FasPreMAn ;
   private java.math.BigDecimal[] P039K2_A4386FasPreKAn ;
   private boolean[] P039K2_n4386FasPreKAn ;
   private java.util.Date[] P039K2_A4385FasPreFAc ;
   private boolean[] P039K2_n4385FasPreFAc ;
   private String[] P039K2_A3615FasFacCod ;
   private boolean[] P039K2_n3615FasFacCod ;
   private String[] P039K2_A470FasSumTin ;
   private boolean[] P039K2_n470FasSumTin ;
   private java.math.BigDecimal[] P039K2_A466FasPreKgm ;
   private boolean[] P039K2_n466FasPreKgm ;
   private java.math.BigDecimal[] P039K2_A467FasPreMtr ;
   private boolean[] P039K2_n467FasPreMtr ;
   private String[] P039K2_A457FasCod ;
   private String[] P039K2_A14042FasActiva ;
   private String[] P039K4_A396EmprCod ;
   private int[] P039K4_A252CliCod ;
   private String[] P039K4_A457FasCod ;
   private String[] P039K4_A8507PFATip ;
   private boolean[] P039K4_n8507PFATip ;
   private java.math.BigDecimal[] P039K4_A8506PFAPre ;
   private boolean[] P039K4_n8506PFAPre ;
   private short[] P039K4_A7727ArtAdiCod ;
}

final  class pduppref__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P039K2", "SELECT T1.EmprCod, T1.CliCod, T1.FasFactura, T1.FasKgsEnt, T1.FasKgsMn, T1.FasPreKgF, T1.FasPreMt2, T1.FasPreU, T1.ClifsiUl, T1.ClifsdUl, T1.FasPreFAn, T1.FasPreMAn, T1.FasPreKAn, T1.FasPreFAc, T1.FasFacCod, T1.FasSumTin, T1.FasPreKgm, T1.FasPreMtr, T1.FasCod, T2.FasActiva FROM (TXPPREFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE (T1.EmprCod = ? and T1.CliCod = ?) AND (T2.FasActiva = 'S') ORDER BY T1.EmprCod, T1.CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P039K3", "INSERT INTO TXPPREFAS(EmprCod, CliCod, FasCod, FasPreMtr, FasPreKgm, FasSumTin, FasFacCod, FasPreFAc, FasPreKAn, FasPreMAn, FasPreFAn, ClifsdUl, ClifsiUl, FasPreU, FasPreMt2, FasPreKgF, FasKgsMn, FasKgsEnt, FasFactura) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPREFAS")
         ,new ForEachCursor("P039K4", "SELECT EmprCod, CliCod, FasCod, PFATip, PFAPre, ArtAdiCod FROM TXPARTPFA WHERE EmprCod = ? and CliCod = ? and FasCod = ? ORDER BY EmprCod, CliCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P039K5", "INSERT INTO TXPARTPFA(EmprCod, CliCod, FasCod, ArtAdiCod, PFAPre, PFATip) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPARTPFA")
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
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(12,5);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(13,5);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(14);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(15, 6);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(16, 1);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(17,5);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(18,5);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(19, 8);
               ((String[]) buf[34])[0] = rslt.getString(20, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 5);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[6], 5);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 1);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[10], 6);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DATE );
               }
               else
               {
                  stmt.setDate(8, (java.util.Date)parms[12]);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[14], 5);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[16], 5);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DATE );
               }
               else
               {
                  stmt.setDate(11, (java.util.Date)parms[18]);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[20]).shortValue());
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[22]).shortValue());
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(14, ((Number) parms[24]).byteValue());
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[26], 5);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[28], 1);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(17, (java.math.BigDecimal)parms[30], 2);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[32], 1);
               }
               stmt.setString(19, (String)parms[33], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[7], 1);
               }
               return;
      }
   }

}

