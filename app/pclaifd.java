package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclaifd extends GXProcedure
{
   public pclaifd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclaifd.class ), "" );
   }

   public pclaifd( int remoteHandle ,
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
      pclaifd.this.aP9 = new String[] {""};
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
      pclaifd.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pclaifd.this.AV15Descrip = aP1[0];
      this.aP1 = aP1;
      pclaifd.this.AV16Clave = aP2[0];
      this.aP2 = aP2;
      pclaifd.this.AV17PrdVal = aP3[0];
      this.aP3 = aP3;
      pclaifd.this.AV114Discod = aP4[0];
      this.aP4 = aP4;
      pclaifd.this.AV21TotKil = aP5[0];
      this.aP5 = aP5;
      pclaifd.this.AV22PrdDesc = aP6[0];
      this.aP6 = aP6;
      pclaifd.this.AV23Accion = aP7[0];
      this.aP7 = aP7;
      pclaifd.this.AV112Opi = aP8[0];
      this.aP8 = aP8;
      pclaifd.this.AV113Barfactin = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV23Accion = GXutil.substring( AV16Clave, 10, 1) ;
      AV51IntCod = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 4, 2))) ;
      AV91Family = GXutil.substring( AV16Clave, 7, 2) ;
      /* Using cursor P026Y2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV114Discod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P026Y2_A361DisCod[0] ;
         A252CliCod = P026Y2_A252CliCod[0] ;
         A335DisArtCod = P026Y2_A335DisArtCod[0] ;
         A362DisColNom = P026Y2_A362DisColNom[0] ;
         n362DisColNom = P026Y2_n362DisColNom[0] ;
         A363DisColNum = P026Y2_A363DisColNum[0] ;
         n363DisColNum = P026Y2_n363DisColNum[0] ;
         A390DisTipCol = P026Y2_A390DisTipCol[0] ;
         n390DisTipCol = P026Y2_n390DisTipCol[0] ;
         AV41BarCliCod = A252CliCod ;
         AV46ForSer = A335DisArtCod ;
         AV47ForColNom = A362DisColNom ;
         AV48ForColNum = A363DisColNum ;
         AV49TipColCod = A390DisTipCol ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Execute user subroutine: 'INTENS' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'COLORANTES' */
      S121 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( ( AV94Ok_family == 1 ) && ( AV95Ok_intens == 1 ) )
      {
         AV17PrdVal = (byte)(1) ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'INTENS' Routine */
      returnInSub = false ;
      AV92ForNumCol = 0 ;
      AV95Ok_intens = (byte)(0) ;
      /* Using cursor P026Y3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV41BarCliCod), AV46ForSer, AV47ForColNom, Integer.valueOf(AV48ForColNum), Byte.valueOf(AV49TipColCod), Byte.valueOf(AV51IntCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A583IntCod = P026Y3_A583IntCod[0] ;
         A831TipColCod = P026Y3_A831TipColCod[0] ;
         A483ForColNum = P026Y3_A483ForColNum[0] ;
         A482ForColNom = P026Y3_A482ForColNom[0] ;
         A494ForSer = P026Y3_A494ForSer[0] ;
         A252CliCod = P026Y3_A252CliCod[0] ;
         A486ForNumCol = P026Y3_A486ForNumCol[0] ;
         AV95Ok_intens = (byte)(1) ;
         AV92ForNumCol = A486ForNumCol ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   public void S121( )
   {
      /* 'COLORANTES' Routine */
      returnInSub = false ;
      AV94Ok_family = (byte)(0) ;
      /* Using cursor P026Y4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV92ForNumCol)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A486ForNumCol = P026Y4_A486ForNumCol[0] ;
         A719PrdNum = P026Y4_A719PrdNum[0] ;
         A309ColLin = P026Y4_A309ColLin[0] ;
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
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pclaifd.this.A396EmprCod;
      this.aP1[0] = pclaifd.this.AV15Descrip;
      this.aP2[0] = pclaifd.this.AV16Clave;
      this.aP3[0] = pclaifd.this.AV17PrdVal;
      this.aP4[0] = pclaifd.this.AV114Discod;
      this.aP5[0] = pclaifd.this.AV21TotKil;
      this.aP6[0] = pclaifd.this.AV22PrdDesc;
      this.aP7[0] = pclaifd.this.AV23Accion;
      this.aP8[0] = pclaifd.this.AV112Opi;
      this.aP9[0] = pclaifd.this.AV113Barfactin;
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
      scmdbuf = "" ;
      P026Y2_A396EmprCod = new String[] {""} ;
      P026Y2_A361DisCod = new int[1] ;
      P026Y2_A252CliCod = new int[1] ;
      P026Y2_A335DisArtCod = new String[] {""} ;
      P026Y2_A362DisColNom = new String[] {""} ;
      P026Y2_n362DisColNom = new boolean[] {false} ;
      P026Y2_A363DisColNum = new int[1] ;
      P026Y2_n363DisColNum = new boolean[] {false} ;
      P026Y2_A390DisTipCol = new byte[1] ;
      P026Y2_n390DisTipCol = new boolean[] {false} ;
      A335DisArtCod = "" ;
      A362DisColNom = "" ;
      AV46ForSer = "" ;
      AV47ForColNom = "" ;
      P026Y3_A396EmprCod = new String[] {""} ;
      P026Y3_A583IntCod = new byte[1] ;
      P026Y3_A831TipColCod = new byte[1] ;
      P026Y3_A483ForColNum = new int[1] ;
      P026Y3_A482ForColNom = new String[] {""} ;
      P026Y3_A494ForSer = new String[] {""} ;
      P026Y3_A252CliCod = new int[1] ;
      P026Y3_A486ForNumCol = new int[1] ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      P026Y4_A396EmprCod = new String[] {""} ;
      P026Y4_A486ForNumCol = new int[1] ;
      P026Y4_A719PrdNum = new String[] {""} ;
      P026Y4_A309ColLin = new short[1] ;
      A719PrdNum = "" ;
      AV96FamiliaA = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclaifd__default(),
         new Object[] {
             new Object[] {
            P026Y2_A396EmprCod, P026Y2_A361DisCod, P026Y2_A252CliCod, P026Y2_A335DisArtCod, P026Y2_A362DisColNom, P026Y2_n362DisColNom, P026Y2_A363DisColNum, P026Y2_n363DisColNum, P026Y2_A390DisTipCol, P026Y2_n390DisTipCol
            }
            , new Object[] {
            P026Y3_A396EmprCod, P026Y3_A583IntCod, P026Y3_A831TipColCod, P026Y3_A483ForColNum, P026Y3_A482ForColNom, P026Y3_A494ForSer, P026Y3_A252CliCod, P026Y3_A486ForNumCol
            }
            , new Object[] {
            P026Y4_A396EmprCod, P026Y4_A486ForNumCol, P026Y4_A719PrdNum, P026Y4_A309ColLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17PrdVal ;
   private byte AV112Opi ;
   private byte AV51IntCod ;
   private byte A390DisTipCol ;
   private byte AV49TipColCod ;
   private byte AV94Ok_family ;
   private byte AV95Ok_intens ;
   private byte A583IntCod ;
   private byte A831TipColCod ;
   private byte AV93Length ;
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
   private String scmdbuf ;
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
   private String[] P026Y2_A396EmprCod ;
   private int[] P026Y2_A361DisCod ;
   private int[] P026Y2_A252CliCod ;
   private String[] P026Y2_A335DisArtCod ;
   private String[] P026Y2_A362DisColNom ;
   private boolean[] P026Y2_n362DisColNom ;
   private int[] P026Y2_A363DisColNum ;
   private boolean[] P026Y2_n363DisColNum ;
   private byte[] P026Y2_A390DisTipCol ;
   private boolean[] P026Y2_n390DisTipCol ;
   private String[] P026Y3_A396EmprCod ;
   private byte[] P026Y3_A583IntCod ;
   private byte[] P026Y3_A831TipColCod ;
   private int[] P026Y3_A483ForColNum ;
   private String[] P026Y3_A482ForColNom ;
   private String[] P026Y3_A494ForSer ;
   private int[] P026Y3_A252CliCod ;
   private int[] P026Y3_A486ForNumCol ;
   private String[] P026Y4_A396EmprCod ;
   private int[] P026Y4_A486ForNumCol ;
   private String[] P026Y4_A719PrdNum ;
   private short[] P026Y4_A309ColLin ;
}

final  class pclaifd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P026Y2", "SELECT EmprCod, DisCod, CliCod, DisArtCod, DisColNom, DisColNum, DisTipCol FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P026Y3", "SELECT EmprCod, IntCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod, ForNumCol FROM TXPCFORMU WHERE (EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ?) AND (IntCod = ?) ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P026Y4", "SELECT EmprCod, ForNumCol, PrdNum, ColLin FROM TXPLDFORM WHERE EmprCod = ? and ForNumCol = ? ORDER BY EmprCod, ForNumCol, ColLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 2 :
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
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

