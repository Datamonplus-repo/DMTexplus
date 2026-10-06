package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclammd extends GXProcedure
{
   public pclammd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclammd.class ), "" );
   }

   public pclammd( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 ,
                             int[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             byte[] aP8 )
   {
      pclammd.this.aP9 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 ,
                        int[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        byte[] aP8 ,
                        String[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 ,
                             int[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             byte[] aP8 ,
                             String[] aP9 )
   {
      pclammd.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pclammd.this.AV15Descrip = aP1[0];
      this.aP1 = aP1;
      pclammd.this.AV16Clave = aP2[0];
      this.aP2 = aP2;
      pclammd.this.AV17PrdVal = aP3[0];
      this.aP3 = aP3;
      pclammd.this.AV114Discod = aP4[0];
      this.aP4 = aP4;
      pclammd.this.AV21TotKil = aP5[0];
      this.aP5 = aP5;
      pclammd.this.AV22PrdDesc = aP6[0];
      this.aP6 = aP6;
      pclammd.this.AV23Accion = aP7[0];
      this.aP7 = aP7;
      pclammd.this.AV112Opi = aP8[0];
      this.aP8 = aP8;
      pclammd.this.AV113Barfactin = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV23Accion = GXutil.substring( AV16Clave, 11, 1) ;
      AV31Matiz = (short)(GXutil.lval( GXutil.substring( AV16Clave, 4, 3))) ;
      AV91Family = GXutil.substring( AV16Clave, 8, 2) ;
      AV97BarAcc = GXutil.space( (short)(1)) ;
      /* Using cursor P02792 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV114Discod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P02792_A361DisCod[0] ;
         A5252DisAcc = P02792_A5252DisAcc[0] ;
         A252CliCod = P02792_A252CliCod[0] ;
         A335DisArtCod = P02792_A335DisArtCod[0] ;
         A362DisColNom = P02792_A362DisColNom[0] ;
         n362DisColNom = P02792_n362DisColNom[0] ;
         A363DisColNum = P02792_A363DisColNum[0] ;
         n363DisColNum = P02792_n363DisColNum[0] ;
         A390DisTipCol = P02792_A390DisTipCol[0] ;
         n390DisTipCol = P02792_n390DisTipCol[0] ;
         AV97BarAcc = A5252DisAcc ;
         AV41BarCliCod = A252CliCod ;
         AV46ForSer = A335DisArtCod ;
         AV47ForColNom = A362DisColNom ;
         AV48ForColNum = A363DisColNum ;
         AV49TipColCod = A390DisTipCol ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Execute user subroutine: 'CFORMU' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'COLORANTES' */
      S131 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'MATIZ' */
      S121 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( ( GXutil.strcmp(AV97BarAcc, httpContext.getMessage( "S", "")) == 0 ) && ( AV94Ok_family == 1 ) && ( AV98Ok_matiz == 1 ) )
      {
         AV17PrdVal = (byte)(1) ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'CFORMU' Routine */
      returnInSub = false ;
      AV92ForNumCol = 0 ;
      /* Using cursor P02793 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV41BarCliCod), AV46ForSer, AV47ForColNom, Integer.valueOf(AV48ForColNum), Byte.valueOf(AV49TipColCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A831TipColCod = P02793_A831TipColCod[0] ;
         A483ForColNum = P02793_A483ForColNum[0] ;
         A482ForColNom = P02793_A482ForColNom[0] ;
         A494ForSer = P02793_A494ForSer[0] ;
         A252CliCod = P02793_A252CliCod[0] ;
         A486ForNumCol = P02793_A486ForNumCol[0] ;
         AV92ForNumCol = A486ForNumCol ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   public void S121( )
   {
      /* 'MATIZ' Routine */
      returnInSub = false ;
      AV98Ok_matiz = (byte)(0) ;
      /* Using cursor P02794 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV41BarCliCod), AV46ForSer, AV47ForColNom, Integer.valueOf(AV48ForColNum), Byte.valueOf(AV49TipColCod), Short.valueOf(AV31Matiz)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A626MatCod = P02794_A626MatCod[0] ;
         A831TipColCod = P02794_A831TipColCod[0] ;
         A483ForColNum = P02794_A483ForColNum[0] ;
         A482ForColNom = P02794_A482ForColNom[0] ;
         A494ForSer = P02794_A494ForSer[0] ;
         A252CliCod = P02794_A252CliCod[0] ;
         AV98Ok_matiz = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   public void S131( )
   {
      /* 'COLORANTES' Routine */
      returnInSub = false ;
      AV94Ok_family = (byte)(0) ;
      /* Using cursor P02795 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV92ForNumCol)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A486ForNumCol = P02795_A486ForNumCol[0] ;
         A719PrdNum = P02795_A719PrdNum[0] ;
         A309ColLin = P02795_A309ColLin[0] ;
         AV93Length = (byte)(GXutil.len( A719PrdNum)) ;
         if ( AV93Length > 5 )
         {
            if ( DecimalUtil.compareTo(CommonUtil.decimalVal( GXutil.substring( A719PrdNum, 1, 2), "."), CommonUtil.decimalVal( AV91Family, ".")) == 0 )
            {
               AV94Ok_family = (byte)(1) ;
            }
         }
         else
         {
            AV96FamiliaA = GXutil.substring( AV91Family, 1, 1) ;
            if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), AV96FamiliaA) == 0 )
            {
               AV94Ok_family = (byte)(1) ;
            }
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pclammd.this.A396EmprCod;
      this.aP1[0] = pclammd.this.AV15Descrip;
      this.aP2[0] = pclammd.this.AV16Clave;
      this.aP3[0] = pclammd.this.AV17PrdVal;
      this.aP4[0] = pclammd.this.AV114Discod;
      this.aP5[0] = pclammd.this.AV21TotKil;
      this.aP6[0] = pclammd.this.AV22PrdDesc;
      this.aP7[0] = pclammd.this.AV23Accion;
      this.aP8[0] = pclammd.this.AV112Opi;
      this.aP9[0] = pclammd.this.AV113Barfactin;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV91Family = "" ;
      AV97BarAcc = "" ;
      scmdbuf = "" ;
      P02792_A396EmprCod = new String[] {""} ;
      P02792_A361DisCod = new int[1] ;
      P02792_A5252DisAcc = new String[] {""} ;
      P02792_A252CliCod = new int[1] ;
      P02792_A335DisArtCod = new String[] {""} ;
      P02792_A362DisColNom = new String[] {""} ;
      P02792_n362DisColNom = new boolean[] {false} ;
      P02792_A363DisColNum = new int[1] ;
      P02792_n363DisColNum = new boolean[] {false} ;
      P02792_A390DisTipCol = new byte[1] ;
      P02792_n390DisTipCol = new boolean[] {false} ;
      A5252DisAcc = "" ;
      A335DisArtCod = "" ;
      A362DisColNom = "" ;
      AV46ForSer = "" ;
      AV47ForColNom = "" ;
      P02793_A396EmprCod = new String[] {""} ;
      P02793_A831TipColCod = new byte[1] ;
      P02793_A483ForColNum = new int[1] ;
      P02793_A482ForColNom = new String[] {""} ;
      P02793_A494ForSer = new String[] {""} ;
      P02793_A252CliCod = new int[1] ;
      P02793_A486ForNumCol = new int[1] ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      P02794_A396EmprCod = new String[] {""} ;
      P02794_A626MatCod = new short[1] ;
      P02794_A831TipColCod = new byte[1] ;
      P02794_A483ForColNum = new int[1] ;
      P02794_A482ForColNom = new String[] {""} ;
      P02794_A494ForSer = new String[] {""} ;
      P02794_A252CliCod = new int[1] ;
      P02795_A396EmprCod = new String[] {""} ;
      P02795_A486ForNumCol = new int[1] ;
      P02795_A719PrdNum = new String[] {""} ;
      P02795_A309ColLin = new short[1] ;
      A719PrdNum = "" ;
      AV96FamiliaA = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclammd__default(),
         new Object[] {
             new Object[] {
            P02792_A396EmprCod, P02792_A361DisCod, P02792_A5252DisAcc, P02792_A252CliCod, P02792_A335DisArtCod, P02792_A362DisColNom, P02792_n362DisColNom, P02792_A363DisColNum, P02792_n363DisColNum, P02792_A390DisTipCol,
            P02792_n390DisTipCol
            }
            , new Object[] {
            P02793_A396EmprCod, P02793_A831TipColCod, P02793_A483ForColNum, P02793_A482ForColNom, P02793_A494ForSer, P02793_A252CliCod, P02793_A486ForNumCol
            }
            , new Object[] {
            P02794_A396EmprCod, P02794_A626MatCod, P02794_A831TipColCod, P02794_A483ForColNum, P02794_A482ForColNom, P02794_A494ForSer, P02794_A252CliCod
            }
            , new Object[] {
            P02795_A396EmprCod, P02795_A486ForNumCol, P02795_A719PrdNum, P02795_A309ColLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17PrdVal ;
   private byte AV112Opi ;
   private byte A390DisTipCol ;
   private byte AV49TipColCod ;
   private byte AV94Ok_family ;
   private byte AV98Ok_matiz ;
   private byte A831TipColCod ;
   private byte AV93Length ;
   private short AV31Matiz ;
   private short A626MatCod ;
   private short A309ColLin ;
   private short Gx_err ;
   private int AV114Discod ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A363DisColNum ;
   private int AV41BarCliCod ;
   private int AV48ForColNum ;
   private int AV92ForNumCol ;
   private int A483ForColNum ;
   private int A486ForNumCol ;
   private java.math.BigDecimal AV21TotKil ;
   private String A396EmprCod ;
   private String AV15Descrip ;
   private String AV16Clave ;
   private String AV22PrdDesc ;
   private String AV23Accion ;
   private String AV113Barfactin ;
   private String AV91Family ;
   private String AV97BarAcc ;
   private String scmdbuf ;
   private String A5252DisAcc ;
   private String A335DisArtCod ;
   private String A362DisColNom ;
   private String AV46ForSer ;
   private String AV47ForColNom ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A719PrdNum ;
   private String AV96FamiliaA ;
   private boolean n362DisColNom ;
   private boolean n363DisColNum ;
   private boolean n390DisTipCol ;
   private boolean returnInSub ;
   private String[] aP9 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private byte[] aP3 ;
   private int[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private byte[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P02792_A396EmprCod ;
   private int[] P02792_A361DisCod ;
   private String[] P02792_A5252DisAcc ;
   private int[] P02792_A252CliCod ;
   private String[] P02792_A335DisArtCod ;
   private String[] P02792_A362DisColNom ;
   private boolean[] P02792_n362DisColNom ;
   private int[] P02792_A363DisColNum ;
   private boolean[] P02792_n363DisColNum ;
   private byte[] P02792_A390DisTipCol ;
   private boolean[] P02792_n390DisTipCol ;
   private String[] P02793_A396EmprCod ;
   private byte[] P02793_A831TipColCod ;
   private int[] P02793_A483ForColNum ;
   private String[] P02793_A482ForColNom ;
   private String[] P02793_A494ForSer ;
   private int[] P02793_A252CliCod ;
   private int[] P02793_A486ForNumCol ;
   private String[] P02794_A396EmprCod ;
   private short[] P02794_A626MatCod ;
   private byte[] P02794_A831TipColCod ;
   private int[] P02794_A483ForColNum ;
   private String[] P02794_A482ForColNom ;
   private String[] P02794_A494ForSer ;
   private int[] P02794_A252CliCod ;
   private String[] P02795_A396EmprCod ;
   private int[] P02795_A486ForNumCol ;
   private String[] P02795_A719PrdNum ;
   private short[] P02795_A309ColLin ;
}

final  class pclammd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02792", "SELECT EmprCod, DisCod, DisAcc, CliCod, DisArtCod, DisColNom, DisColNum, DisTipCol FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02793", "SELECT EmprCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod, ForNumCol FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02794", "SELECT EmprCod, MatCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod FROM TXPCFORMU WHERE (EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ?) AND (MatCod = ?) ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02795", "SELECT EmprCod, ForNumCol, PrdNum, ColLin FROM TXPLDFORM WHERE EmprCod = ? and ForNumCol = ? ORDER BY EmprCod, ForNumCol, ColLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

