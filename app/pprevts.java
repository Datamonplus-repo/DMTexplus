package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprevts extends GXProcedure
{
   public pprevts( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprevts.class ), "" );
   }

   public pprevts( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           byte[] aP3 )
   {
      pprevts.this.aP4 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 ,
                        byte[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 ,
                             byte[] aP4 )
   {
      pprevts.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprevts.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pprevts.this.A65ArtCod = aP2[0];
      this.aP2 = aP2;
      pprevts.this.A831TipColCod = aP3[0];
      this.aP3 = aP3;
      pprevts.this.AV8IntCod = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P04C02 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A584IntDsc = P04C02_A584IntDsc[0] ;
         n584IntDsc = P04C02_n584IntDsc[0] ;
         A583IntCod = P04C02_A583IntCod[0] ;
         A584IntDsc = P04C02_A584IntDsc[0] ;
         n584IntDsc = P04C02_n584IntDsc[0] ;
         if ( A583IntCod != AV8IntCod )
         {
            AV9IntCodd = A583IntCod ;
            AV10IntDsc = A584IntDsc ;
            /* Execute user subroutine: 'CREAR' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'CREAR' Routine */
      returnInSub = false ;
      /* Using cursor P04C03 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(AV8IntCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A10973Int_Dsc = P04C03_A10973Int_Dsc[0] ;
         n10973Int_Dsc = P04C03_n10973Int_Dsc[0] ;
         A10972Int_cod = P04C03_A10972Int_cod[0] ;
         W396EmprCod = A396EmprCod ;
         W252CliCod = A252CliCod ;
         W65ArtCod = A65ArtCod ;
         W10972Int_cod = A10972Int_cod ;
         /*
            INSERT RECORD ON TABLE TXPINCINT

         */
         W396EmprCod = A396EmprCod ;
         W252CliCod = A252CliCod ;
         W65ArtCod = A65ArtCod ;
         W10972Int_cod = A10972Int_cod ;
         W10973Int_Dsc = A10973Int_Dsc ;
         n10973Int_Dsc = false ;
         A10972Int_cod = AV9IntCodd ;
         A10973Int_Dsc = AV10IntDsc ;
         n10973Int_Dsc = false ;
         /* Using cursor P04C04 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A10972Int_cod), Boolean.valueOf(n10973Int_Dsc), A10973Int_Dsc});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINCINT");
         if ( (pr_default.getStatus(2) == 1) )
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
         A252CliCod = W252CliCod ;
         A65ArtCod = W65ArtCod ;
         A10972Int_cod = W10972Int_cod ;
         A10973Int_Dsc = W10973Int_Dsc ;
         n10973Int_Dsc = false ;
         /* End Insert */
         /* Using cursor P04C05 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A10972Int_cod)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A10965Int_Ulin = P04C05_A10965Int_Ulin[0] ;
            n10965Int_Ulin = P04C05_n10965Int_Ulin[0] ;
            A11043Int_Un = P04C05_A11043Int_Un[0] ;
            W396EmprCod = A396EmprCod ;
            W252CliCod = A252CliCod ;
            W65ArtCod = A65ArtCod ;
            W10972Int_cod = A10972Int_cod ;
            /*
               INSERT RECORD ON TABLE TXPuINCIN

            */
            W396EmprCod = A396EmprCod ;
            W252CliCod = A252CliCod ;
            W65ArtCod = A65ArtCod ;
            W10972Int_cod = A10972Int_cod ;
            W11043Int_Un = A11043Int_Un ;
            W10965Int_Ulin = A10965Int_Ulin ;
            n10965Int_Ulin = false ;
            A10972Int_cod = AV9IntCodd ;
            n10965Int_Ulin = false ;
            /* Using cursor P04C06 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A10972Int_cod), A11043Int_Un, Boolean.valueOf(n10965Int_Ulin), Short.valueOf(A10965Int_Ulin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPuINCIN");
            if ( (pr_default.getStatus(4) == 1) )
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
            A252CliCod = W252CliCod ;
            A65ArtCod = W65ArtCod ;
            A10972Int_cod = W10972Int_cod ;
            A11043Int_Un = W11043Int_Un ;
            A10965Int_Ulin = W10965Int_Ulin ;
            n10965Int_Ulin = false ;
            /* End Insert */
            /* Using cursor P04C07 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A10972Int_cod), A11043Int_Un});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A10971Int_Tp = P04C07_A10971Int_Tp[0] ;
               n10971Int_Tp = P04C07_n10971Int_Tp[0] ;
               A10970Int_Pm = P04C07_A10970Int_Pm[0] ;
               n10970Int_Pm = P04C07_n10970Int_Pm[0] ;
               A10969Int_Pk = P04C07_A10969Int_Pk[0] ;
               n10969Int_Pk = P04C07_n10969Int_Pk[0] ;
               A10968Int_ValF = P04C07_A10968Int_ValF[0] ;
               n10968Int_ValF = P04C07_n10968Int_ValF[0] ;
               A10967Int_ValI = P04C07_A10967Int_ValI[0] ;
               n10967Int_ValI = P04C07_n10967Int_ValI[0] ;
               A10966Int_Lin = P04C07_A10966Int_Lin[0] ;
               W396EmprCod = A396EmprCod ;
               W252CliCod = A252CliCod ;
               W65ArtCod = A65ArtCod ;
               W10972Int_cod = A10972Int_cod ;
               W11043Int_Un = A11043Int_Un ;
               /*
                  INSERT RECORD ON TABLE TXPINCIN1

               */
               W396EmprCod = A396EmprCod ;
               W252CliCod = A252CliCod ;
               W65ArtCod = A65ArtCod ;
               W10972Int_cod = A10972Int_cod ;
               W11043Int_Un = A11043Int_Un ;
               W10966Int_Lin = A10966Int_Lin ;
               A10972Int_cod = AV9IntCodd ;
               /* Using cursor P04C08 */
               pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A10972Int_cod), A11043Int_Un, Short.valueOf(A10966Int_Lin), Boolean.valueOf(n10967Int_ValI), A10967Int_ValI, Boolean.valueOf(n10968Int_ValF), A10968Int_ValF, Boolean.valueOf(n10969Int_Pk), A10969Int_Pk, Boolean.valueOf(n10970Int_Pm), A10970Int_Pm, Boolean.valueOf(n10971Int_Tp), A10971Int_Tp});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINCIN1");
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
               A252CliCod = W252CliCod ;
               A65ArtCod = W65ArtCod ;
               A10972Int_cod = W10972Int_cod ;
               A11043Int_Un = W11043Int_Un ;
               A10966Int_Lin = W10966Int_Lin ;
               /* End Insert */
               A396EmprCod = W396EmprCod ;
               A252CliCod = W252CliCod ;
               A65ArtCod = W65ArtCod ;
               A10972Int_cod = W10972Int_cod ;
               A11043Int_Un = W11043Int_Un ;
               pr_default.readNext(5);
            }
            pr_default.close(5);
            A396EmprCod = W396EmprCod ;
            A252CliCod = W252CliCod ;
            A65ArtCod = W65ArtCod ;
            A10972Int_cod = W10972Int_cod ;
            pr_default.readNext(3);
         }
         pr_default.close(3);
         A396EmprCod = W396EmprCod ;
         A252CliCod = W252CliCod ;
         A65ArtCod = W65ArtCod ;
         A10972Int_cod = W10972Int_cod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprevts.this.A396EmprCod;
      this.aP1[0] = pprevts.this.A252CliCod;
      this.aP2[0] = pprevts.this.A65ArtCod;
      this.aP3[0] = pprevts.this.A831TipColCod;
      this.aP4[0] = pprevts.this.AV8IntCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pprevts");
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
      P04C02_A396EmprCod = new String[] {""} ;
      P04C02_A252CliCod = new int[1] ;
      P04C02_A65ArtCod = new String[] {""} ;
      P04C02_A831TipColCod = new byte[1] ;
      P04C02_A584IntDsc = new String[] {""} ;
      P04C02_n584IntDsc = new boolean[] {false} ;
      P04C02_A583IntCod = new byte[1] ;
      A584IntDsc = "" ;
      AV10IntDsc = "" ;
      P04C03_A396EmprCod = new String[] {""} ;
      P04C03_A252CliCod = new int[1] ;
      P04C03_A65ArtCod = new String[] {""} ;
      P04C03_A10973Int_Dsc = new String[] {""} ;
      P04C03_n10973Int_Dsc = new boolean[] {false} ;
      P04C03_A10972Int_cod = new byte[1] ;
      A10973Int_Dsc = "" ;
      W396EmprCod = "" ;
      W65ArtCod = "" ;
      W10973Int_Dsc = "" ;
      Gx_emsg = "" ;
      P04C05_A396EmprCod = new String[] {""} ;
      P04C05_A252CliCod = new int[1] ;
      P04C05_A65ArtCod = new String[] {""} ;
      P04C05_A10972Int_cod = new byte[1] ;
      P04C05_A10965Int_Ulin = new short[1] ;
      P04C05_n10965Int_Ulin = new boolean[] {false} ;
      P04C05_A11043Int_Un = new String[] {""} ;
      A11043Int_Un = "" ;
      W11043Int_Un = "" ;
      P04C07_A396EmprCod = new String[] {""} ;
      P04C07_A252CliCod = new int[1] ;
      P04C07_A65ArtCod = new String[] {""} ;
      P04C07_A10972Int_cod = new byte[1] ;
      P04C07_A11043Int_Un = new String[] {""} ;
      P04C07_A10971Int_Tp = new String[] {""} ;
      P04C07_n10971Int_Tp = new boolean[] {false} ;
      P04C07_A10970Int_Pm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04C07_n10970Int_Pm = new boolean[] {false} ;
      P04C07_A10969Int_Pk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04C07_n10969Int_Pk = new boolean[] {false} ;
      P04C07_A10968Int_ValF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04C07_n10968Int_ValF = new boolean[] {false} ;
      P04C07_A10967Int_ValI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04C07_n10967Int_ValI = new boolean[] {false} ;
      P04C07_A10966Int_Lin = new short[1] ;
      A10971Int_Tp = "" ;
      A10970Int_Pm = DecimalUtil.ZERO ;
      A10969Int_Pk = DecimalUtil.ZERO ;
      A10968Int_ValF = DecimalUtil.ZERO ;
      A10967Int_ValI = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprevts__default(),
         new Object[] {
             new Object[] {
            P04C02_A396EmprCod, P04C02_A252CliCod, P04C02_A65ArtCod, P04C02_A831TipColCod, P04C02_A584IntDsc, P04C02_n584IntDsc, P04C02_A583IntCod
            }
            , new Object[] {
            P04C03_A396EmprCod, P04C03_A252CliCod, P04C03_A65ArtCod, P04C03_A10973Int_Dsc, P04C03_n10973Int_Dsc, P04C03_A10972Int_cod
            }
            , new Object[] {
            }
            , new Object[] {
            P04C05_A396EmprCod, P04C05_A252CliCod, P04C05_A65ArtCod, P04C05_A10972Int_cod, P04C05_A10965Int_Ulin, P04C05_n10965Int_Ulin, P04C05_A11043Int_Un
            }
            , new Object[] {
            }
            , new Object[] {
            P04C07_A396EmprCod, P04C07_A252CliCod, P04C07_A65ArtCod, P04C07_A10972Int_cod, P04C07_A11043Int_Un, P04C07_A10971Int_Tp, P04C07_n10971Int_Tp, P04C07_A10970Int_Pm, P04C07_n10970Int_Pm, P04C07_A10969Int_Pk,
            P04C07_n10969Int_Pk, P04C07_A10968Int_ValF, P04C07_n10968Int_ValF, P04C07_A10967Int_ValI, P04C07_n10967Int_ValI, P04C07_A10966Int_Lin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private byte AV8IntCod ;
   private byte A583IntCod ;
   private byte AV9IntCodd ;
   private byte A10972Int_cod ;
   private byte W10972Int_cod ;
   private short Gx_err ;
   private short A10965Int_Ulin ;
   private short W10965Int_Ulin ;
   private short A10966Int_Lin ;
   private short W10966Int_Lin ;
   private int A252CliCod ;
   private int W252CliCod ;
   private int GX_INS1470 ;
   private int GX_INS1468 ;
   private int GX_INS1469 ;
   private java.math.BigDecimal A10970Int_Pm ;
   private java.math.BigDecimal A10969Int_Pk ;
   private java.math.BigDecimal A10968Int_ValF ;
   private java.math.BigDecimal A10967Int_ValI ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String scmdbuf ;
   private String A584IntDsc ;
   private String AV10IntDsc ;
   private String A10973Int_Dsc ;
   private String W396EmprCod ;
   private String W65ArtCod ;
   private String W10973Int_Dsc ;
   private String Gx_emsg ;
   private String A11043Int_Un ;
   private String W11043Int_Un ;
   private String A10971Int_Tp ;
   private boolean n584IntDsc ;
   private boolean returnInSub ;
   private boolean n10973Int_Dsc ;
   private boolean n10965Int_Ulin ;
   private boolean n10971Int_Tp ;
   private boolean n10970Int_Pm ;
   private boolean n10969Int_Pk ;
   private boolean n10968Int_ValF ;
   private boolean n10967Int_ValI ;
   private byte[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private byte[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P04C02_A396EmprCod ;
   private int[] P04C02_A252CliCod ;
   private String[] P04C02_A65ArtCod ;
   private byte[] P04C02_A831TipColCod ;
   private String[] P04C02_A584IntDsc ;
   private boolean[] P04C02_n584IntDsc ;
   private byte[] P04C02_A583IntCod ;
   private String[] P04C03_A396EmprCod ;
   private int[] P04C03_A252CliCod ;
   private String[] P04C03_A65ArtCod ;
   private String[] P04C03_A10973Int_Dsc ;
   private boolean[] P04C03_n10973Int_Dsc ;
   private byte[] P04C03_A10972Int_cod ;
   private String[] P04C05_A396EmprCod ;
   private int[] P04C05_A252CliCod ;
   private String[] P04C05_A65ArtCod ;
   private byte[] P04C05_A10972Int_cod ;
   private short[] P04C05_A10965Int_Ulin ;
   private boolean[] P04C05_n10965Int_Ulin ;
   private String[] P04C05_A11043Int_Un ;
   private String[] P04C07_A396EmprCod ;
   private int[] P04C07_A252CliCod ;
   private String[] P04C07_A65ArtCod ;
   private byte[] P04C07_A10972Int_cod ;
   private String[] P04C07_A11043Int_Un ;
   private String[] P04C07_A10971Int_Tp ;
   private boolean[] P04C07_n10971Int_Tp ;
   private java.math.BigDecimal[] P04C07_A10970Int_Pm ;
   private boolean[] P04C07_n10970Int_Pm ;
   private java.math.BigDecimal[] P04C07_A10969Int_Pk ;
   private boolean[] P04C07_n10969Int_Pk ;
   private java.math.BigDecimal[] P04C07_A10968Int_ValF ;
   private boolean[] P04C07_n10968Int_ValF ;
   private java.math.BigDecimal[] P04C07_A10967Int_ValI ;
   private boolean[] P04C07_n10967Int_ValI ;
   private short[] P04C07_A10966Int_Lin ;
}

final  class pprevts__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04C02", "SELECT T1.EmprCod, T1.CliCod, T1.ArtCod, T1.TipColCod, T2.IntDsc, T1.IntCod FROM (TXPPRETIN T1 INNER JOIN TXPINTENS T2 ON T2.EmprCod = T1.EmprCod AND T2.IntCod = T1.IntCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? and T1.TipColCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.TipColCod, T1.IntCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04C03", "SELECT EmprCod, CliCod, ArtCod, Int_Dsc, Int_cod FROM TXPINCINT WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and Int_cod = ? ORDER BY EmprCod, CliCod, ArtCod, Int_cod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04C04", "INSERT INTO TXPINCINT(EmprCod, CliCod, ArtCod, Int_cod, Int_Dsc) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPINCINT")
         ,new ForEachCursor("P04C05", "SELECT EmprCod, CliCod, ArtCod, Int_cod, Int_Ulin, Int_Un FROM TXPuINCIN WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and Int_cod = ? ORDER BY EmprCod, CliCod, ArtCod, Int_cod, Int_Un ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04C06", "INSERT INTO TXPuINCIN(EmprCod, CliCod, ArtCod, Int_cod, Int_Un, Int_Ulin) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPuINCIN")
         ,new ForEachCursor("P04C07", "SELECT EmprCod, CliCod, ArtCod, Int_cod, Int_Un, Int_Tp, Int_Pm, Int_Pk, Int_ValF, Int_ValI, Int_Lin FROM TXPINCIN1 WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and Int_cod = ? and Int_Un = ? ORDER BY EmprCod, CliCod, ArtCod, Int_cod, Int_Un, Int_Lin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04C08", "INSERT INTO TXPINCIN1(EmprCod, CliCod, ArtCod, Int_cod, Int_Un, Int_Lin, Int_ValI, Int_ValF, Int_Pk, Int_Pm, Int_Tp) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPINCIN1")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(11);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 30);
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[6]).shortValue());
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[11], 5);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[13], 5);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[15], 1);
               }
               return;
      }
   }

}

