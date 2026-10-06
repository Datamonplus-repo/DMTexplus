package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbummap extends GXProcedure
{
   public pbummap( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbummap.class ), "" );
   }

   public pbummap( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pbummap.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      pbummap.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbummap.this.AV15BarCod = aP1[0];
      this.aP1 = aP1;
      pbummap.this.AV16BarCodReo = aP2[0];
      this.aP2 = aP2;
      pbummap.this.AV17BarCodPar = aP3[0];
      this.aP3 = aP3;
      pbummap.this.AV9MacProCod = aP4[0];
      this.aP4 = aP4;
      pbummap.this.AV8BusMod = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV20Eliot ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ELIOT", ""), GXv_int2) ;
      pbummap.this.GXt_int1 = GXv_int2[0] ;
      AV20Eliot = GXt_int1 ;
      /* Using cursor P01F62 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV15BarCod), Byte.valueOf(AV16BarCodReo), AV17BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P01F62_A130BarCodPar[0] ;
         A132BarCodReo = P01F62_A132BarCodReo[0] ;
         A129BarCod = P01F62_A129BarCod[0] ;
         A252CliCod = P01F62_A252CliCod[0] ;
         n252CliCod = P01F62_n252CliCod[0] ;
         A212BarSer = P01F62_A212BarSer[0] ;
         A135BarColNom = P01F62_A135BarColNom[0] ;
         A136BarColNum = P01F62_A136BarColNum[0] ;
         A218BarTipCol = P01F62_A218BarTipCol[0] ;
         A4908BarMacPro = P01F62_A4908BarMacPro[0] ;
         AV10CliCod = A252CliCod ;
         AV11ForSer = A212BarSer ;
         AV12ForColNom = A135BarColNom ;
         AV13ForColNum = A136BarColNum ;
         AV14TipColCod = A218BarTipCol ;
         AV18BarMacPro = A4908BarMacPro ;
         if ( (GXutil.strcmp("", AV18BarMacPro)==0) || ( AV20Eliot == 1 ) )
         {
            /* Execute user subroutine: 'MACROPROC' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'MACROPROC' Routine */
      returnInSub = false ;
      /* Using cursor P01F63 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV10CliCod), AV11ForSer, AV12ForColNom, Integer.valueOf(AV13ForColNum), Byte.valueOf(AV14TipColCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A831TipColCod = P01F63_A831TipColCod[0] ;
         A483ForColNum = P01F63_A483ForColNum[0] ;
         A482ForColNom = P01F63_A482ForColNom[0] ;
         A494ForSer = P01F63_A494ForSer[0] ;
         A252CliCod = P01F63_A252CliCod[0] ;
         n252CliCod = P01F63_n252CliCod[0] ;
         A1514MacProCod = P01F63_A1514MacProCod[0] ;
         n1514MacProCod = P01F63_n1514MacProCod[0] ;
         if ( GXutil.strcmp(AV8BusMod, httpContext.getMessage( "B", "")) == 0 )
         {
            AV9MacProCod = A1514MacProCod ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbummap.this.A396EmprCod;
      this.aP1[0] = pbummap.this.AV15BarCod;
      this.aP2[0] = pbummap.this.AV16BarCodReo;
      this.aP3[0] = pbummap.this.AV17BarCodPar;
      this.aP4[0] = pbummap.this.AV9MacProCod;
      this.aP5[0] = pbummap.this.AV8BusMod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P01F62_A396EmprCod = new String[] {""} ;
      P01F62_A130BarCodPar = new String[] {""} ;
      P01F62_A132BarCodReo = new byte[1] ;
      P01F62_A129BarCod = new int[1] ;
      P01F62_A252CliCod = new int[1] ;
      P01F62_n252CliCod = new boolean[] {false} ;
      P01F62_A212BarSer = new String[] {""} ;
      P01F62_A135BarColNom = new String[] {""} ;
      P01F62_A136BarColNum = new int[1] ;
      P01F62_A218BarTipCol = new byte[1] ;
      P01F62_A4908BarMacPro = new String[] {""} ;
      A130BarCodPar = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A4908BarMacPro = "" ;
      AV11ForSer = "" ;
      AV12ForColNom = "" ;
      AV18BarMacPro = "" ;
      P01F63_A396EmprCod = new String[] {""} ;
      P01F63_A831TipColCod = new byte[1] ;
      P01F63_A483ForColNum = new int[1] ;
      P01F63_A482ForColNom = new String[] {""} ;
      P01F63_A494ForSer = new String[] {""} ;
      P01F63_A252CliCod = new int[1] ;
      P01F63_n252CliCod = new boolean[] {false} ;
      P01F63_A1514MacProCod = new String[] {""} ;
      P01F63_n1514MacProCod = new boolean[] {false} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A1514MacProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbummap__default(),
         new Object[] {
             new Object[] {
            P01F62_A396EmprCod, P01F62_A130BarCodPar, P01F62_A132BarCodReo, P01F62_A129BarCod, P01F62_A252CliCod, P01F62_n252CliCod, P01F62_A212BarSer, P01F62_A135BarColNom, P01F62_A136BarColNum, P01F62_A218BarTipCol,
            P01F62_A4908BarMacPro
            }
            , new Object[] {
            P01F63_A396EmprCod, P01F63_A831TipColCod, P01F63_A483ForColNum, P01F63_A482ForColNom, P01F63_A494ForSer, P01F63_A252CliCod, P01F63_A1514MacProCod, P01F63_n1514MacProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16BarCodReo ;
   private byte AV20Eliot ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte AV14TipColCod ;
   private byte A831TipColCod ;
   private short Gx_err ;
   private int AV15BarCod ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int AV10CliCod ;
   private int AV13ForColNum ;
   private int A483ForColNum ;
   private String A396EmprCod ;
   private String AV17BarCodPar ;
   private String AV9MacProCod ;
   private String AV8BusMod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A4908BarMacPro ;
   private String AV11ForSer ;
   private String AV12ForColNom ;
   private String AV18BarMacPro ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A1514MacProCod ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean n1514MacProCod ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P01F62_A396EmprCod ;
   private String[] P01F62_A130BarCodPar ;
   private byte[] P01F62_A132BarCodReo ;
   private int[] P01F62_A129BarCod ;
   private int[] P01F62_A252CliCod ;
   private boolean[] P01F62_n252CliCod ;
   private String[] P01F62_A212BarSer ;
   private String[] P01F62_A135BarColNom ;
   private int[] P01F62_A136BarColNum ;
   private byte[] P01F62_A218BarTipCol ;
   private String[] P01F62_A4908BarMacPro ;
   private String[] P01F63_A396EmprCod ;
   private byte[] P01F63_A831TipColCod ;
   private int[] P01F63_A483ForColNum ;
   private String[] P01F63_A482ForColNom ;
   private String[] P01F63_A494ForSer ;
   private int[] P01F63_A252CliCod ;
   private boolean[] P01F63_n252CliCod ;
   private String[] P01F63_A1514MacProCod ;
   private boolean[] P01F63_n1514MacProCod ;
}

final  class pbummap__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01F62", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, CliCod, BarSer, BarColNom, BarColNum, BarTipCol, BarMacPro FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01F63", "SELECT EmprCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod, MacProCod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
      }
   }

}

