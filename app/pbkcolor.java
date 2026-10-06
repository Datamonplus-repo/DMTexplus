package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbkcolor extends GXProcedure
{
   public pbkcolor( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbkcolor.class ), "" );
   }

   public pbkcolor( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           String[] aP3 ,
                           int[] aP4 ,
                           byte[] aP5 ,
                           String[] aP6 )
   {
      pbkcolor.this.aP7 = new long[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 ,
                        long[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             long[] aP7 )
   {
      pbkcolor.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbkcolor.this.AV15Clicod = aP1[0];
      this.aP1 = aP1;
      pbkcolor.this.AV12Forser = aP2[0];
      this.aP2 = aP2;
      pbkcolor.this.AV14ForColNom = aP3[0];
      this.aP3 = aP3;
      pbkcolor.this.AV9ForColNum = aP4[0];
      this.aP4 = aP4;
      pbkcolor.this.AV10TipColcod = aP5[0];
      this.aP5 = aP5;
      pbkcolor.this.AV8ForNomcli = aP6[0];
      this.aP6 = aP6;
      pbkcolor.this.AV20ForRgb = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8ForNomcli = "" ;
      AV9ForColNum = 0 ;
      AV10TipColcod = (byte)(0) ;
      AV11Cformu1 = (byte)(0) ;
      AV20ForRgb = 0 ;
      /* Using cursor P05X42 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV15Clicod), AV12Forser, AV14ForColNom});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A482ForColNom = P05X42_A482ForColNom[0] ;
         A494ForSer = P05X42_A494ForSer[0] ;
         A252CliCod = P05X42_A252CliCod[0] ;
         A1191ForNomCli = P05X42_A1191ForNomCli[0] ;
         n1191ForNomCli = P05X42_n1191ForNomCli[0] ;
         A483ForColNum = P05X42_A483ForColNum[0] ;
         A831TipColCod = P05X42_A831TipColCod[0] ;
         A4339ForRGB = P05X42_A4339ForRGB[0] ;
         n4339ForRGB = P05X42_n4339ForRGB[0] ;
         AV8ForNomcli = A1191ForNomCli ;
         AV9ForColNum = A483ForColNum ;
         AV10TipColcod = A831TipColCod ;
         AV20ForRgb = A4339ForRGB ;
         AV11Cformu1 = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV11Cformu1 == 0 )
      {
         AV13Cformu2 = (byte)(0) ;
         /* Using cursor P05X43 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV15Clicod), AV14ForColNom});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A252CliCod = P05X43_A252CliCod[0] ;
            A482ForColNom = P05X43_A482ForColNom[0] ;
            A494ForSer = P05X43_A494ForSer[0] ;
            A483ForColNum = P05X43_A483ForColNum[0] ;
            A831TipColCod = P05X43_A831TipColCod[0] ;
            A1191ForNomCli = P05X43_A1191ForNomCli[0] ;
            n1191ForNomCli = P05X43_n1191ForNomCli[0] ;
            A4339ForRGB = P05X43_A4339ForRGB[0] ;
            n4339ForRGB = P05X43_n4339ForRGB[0] ;
            AV13Cformu2 = (byte)(1) ;
            AV16ForSer2 = A494ForSer ;
            AV18ForColNum2 = A483ForColNum ;
            AV19TipColCod2 = A831TipColCod ;
            AV8ForNomcli = A1191ForNomCli ;
            AV9ForColNum = A483ForColNum ;
            AV10TipColcod = A831TipColCod ;
            AV20ForRgb = A4339ForRGB ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( AV13Cformu2 == 1 )
         {
            GXv_char1[0] = A396EmprCod ;
            GXv_int2[0] = AV15Clicod ;
            GXv_char3[0] = AV16ForSer2 ;
            GXv_char4[0] = AV14ForColNom ;
            GXv_int5[0] = AV18ForColNum2 ;
            GXv_int6[0] = AV19TipColCod2 ;
            GXv_int7[0] = AV15Clicod ;
            GXv_char8[0] = AV12Forser ;
            GXv_char9[0] = AV14ForColNom ;
            GXv_int10[0] = AV18ForColNum2 ;
            GXv_int11[0] = AV19TipColCod2 ;
            GXv_int12[0] = (byte)(1) ;
            new app.formulaciontinte.pdupfor(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_char3, GXv_char4, GXv_int5, GXv_int6, GXv_int7, GXv_char8, GXv_char9, GXv_int10, GXv_int11, GXv_int12) ;
            pbkcolor.this.A396EmprCod = GXv_char1[0] ;
            pbkcolor.this.AV15Clicod = GXv_int2[0] ;
            pbkcolor.this.AV16ForSer2 = GXv_char3[0] ;
            pbkcolor.this.AV14ForColNom = GXv_char4[0] ;
            pbkcolor.this.AV18ForColNum2 = GXv_int5[0] ;
            pbkcolor.this.AV19TipColCod2 = GXv_int6[0] ;
            pbkcolor.this.AV15Clicod = GXv_int7[0] ;
            pbkcolor.this.AV12Forser = GXv_char8[0] ;
            pbkcolor.this.AV14ForColNom = GXv_char9[0] ;
            pbkcolor.this.AV18ForColNum2 = GXv_int10[0] ;
            pbkcolor.this.AV19TipColCod2 = GXv_int11[0] ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbkcolor.this.A396EmprCod;
      this.aP1[0] = pbkcolor.this.AV15Clicod;
      this.aP2[0] = pbkcolor.this.AV12Forser;
      this.aP3[0] = pbkcolor.this.AV14ForColNom;
      this.aP4[0] = pbkcolor.this.AV9ForColNum;
      this.aP5[0] = pbkcolor.this.AV10TipColcod;
      this.aP6[0] = pbkcolor.this.AV8ForNomcli;
      this.aP7[0] = pbkcolor.this.AV20ForRgb;
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
      P05X42_A396EmprCod = new String[] {""} ;
      P05X42_A482ForColNom = new String[] {""} ;
      P05X42_A494ForSer = new String[] {""} ;
      P05X42_A252CliCod = new int[1] ;
      P05X42_A1191ForNomCli = new String[] {""} ;
      P05X42_n1191ForNomCli = new boolean[] {false} ;
      P05X42_A483ForColNum = new int[1] ;
      P05X42_A831TipColCod = new byte[1] ;
      P05X42_A4339ForRGB = new long[1] ;
      P05X42_n4339ForRGB = new boolean[] {false} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A1191ForNomCli = "" ;
      P05X43_A396EmprCod = new String[] {""} ;
      P05X43_A252CliCod = new int[1] ;
      P05X43_A482ForColNom = new String[] {""} ;
      P05X43_A494ForSer = new String[] {""} ;
      P05X43_A483ForColNum = new int[1] ;
      P05X43_A831TipColCod = new byte[1] ;
      P05X43_A1191ForNomCli = new String[] {""} ;
      P05X43_n1191ForNomCli = new boolean[] {false} ;
      P05X43_A4339ForRGB = new long[1] ;
      P05X43_n4339ForRGB = new boolean[] {false} ;
      AV16ForSer2 = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_int7 = new int[1] ;
      GXv_char8 = new String[1] ;
      GXv_char9 = new String[1] ;
      GXv_int10 = new int[1] ;
      GXv_int11 = new byte[1] ;
      GXv_int12 = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbkcolor__default(),
         new Object[] {
             new Object[] {
            P05X42_A396EmprCod, P05X42_A482ForColNom, P05X42_A494ForSer, P05X42_A252CliCod, P05X42_A1191ForNomCli, P05X42_n1191ForNomCli, P05X42_A483ForColNum, P05X42_A831TipColCod, P05X42_A4339ForRGB, P05X42_n4339ForRGB
            }
            , new Object[] {
            P05X43_A396EmprCod, P05X43_A252CliCod, P05X43_A482ForColNom, P05X43_A494ForSer, P05X43_A483ForColNum, P05X43_A831TipColCod, P05X43_A1191ForNomCli, P05X43_n1191ForNomCli, P05X43_A4339ForRGB, P05X43_n4339ForRGB
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10TipColcod ;
   private byte AV11Cformu1 ;
   private byte A831TipColCod ;
   private byte AV13Cformu2 ;
   private byte AV19TipColCod2 ;
   private byte GXv_int6[] ;
   private byte GXv_int11[] ;
   private byte GXv_int12[] ;
   private short Gx_err ;
   private int AV15Clicod ;
   private int AV9ForColNum ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int AV18ForColNum2 ;
   private int GXv_int2[] ;
   private int GXv_int5[] ;
   private int GXv_int7[] ;
   private int GXv_int10[] ;
   private long AV20ForRgb ;
   private long A4339ForRGB ;
   private String A396EmprCod ;
   private String AV12Forser ;
   private String AV14ForColNom ;
   private String AV8ForNomcli ;
   private String scmdbuf ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A1191ForNomCli ;
   private String AV16ForSer2 ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String GXv_char8[] ;
   private String GXv_char9[] ;
   private boolean n1191ForNomCli ;
   private boolean n4339ForRGB ;
   private long[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P05X42_A396EmprCod ;
   private String[] P05X42_A482ForColNom ;
   private String[] P05X42_A494ForSer ;
   private int[] P05X42_A252CliCod ;
   private String[] P05X42_A1191ForNomCli ;
   private boolean[] P05X42_n1191ForNomCli ;
   private int[] P05X42_A483ForColNum ;
   private byte[] P05X42_A831TipColCod ;
   private long[] P05X42_A4339ForRGB ;
   private boolean[] P05X42_n4339ForRGB ;
   private String[] P05X43_A396EmprCod ;
   private int[] P05X43_A252CliCod ;
   private String[] P05X43_A482ForColNom ;
   private String[] P05X43_A494ForSer ;
   private int[] P05X43_A483ForColNum ;
   private byte[] P05X43_A831TipColCod ;
   private String[] P05X43_A1191ForNomCli ;
   private boolean[] P05X43_n1191ForNomCli ;
   private long[] P05X43_A4339ForRGB ;
   private boolean[] P05X43_n4339ForRGB ;
}

final  class pbkcolor__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05X42", "SELECT EmprCod, ForColNom, ForSer, CliCod, ForNomCli, ForColNum, TipColCod, ForRGB FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05X43", "SELECT * FROM (SELECT EmprCod, CliCod, ForColNom, ForSer, ForColNum, TipColCod, ForNomCli, ForRGB FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForColNom = ? ORDER BY EmprCod, CliCod, ForColNom) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((long[]) buf[8])[0] = rslt.getLong(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
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
               stmt.setString(4, (String)parms[3], 13);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 13);
               return;
      }
   }

}

