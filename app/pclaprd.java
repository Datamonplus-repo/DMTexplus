package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclaprd extends GXProcedure
{
   public pclaprd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclaprd.class ), "" );
   }

   public pclaprd( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           String[] aP2 ,
                           byte[] aP3 ,
                           int[] aP4 ,
                           java.math.BigDecimal[] aP5 ,
                           String[] aP6 ,
                           String[] aP7 )
   {
      pclaprd.this.aP8 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 ,
                        int[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        byte[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 ,
                             int[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             byte[] aP8 )
   {
      pclaprd.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pclaprd.this.AV15Descrip = aP1[0];
      this.aP1 = aP1;
      pclaprd.this.AV16Clave = aP2[0];
      this.aP2 = aP2;
      pclaprd.this.AV17PrdVal = aP3[0];
      this.aP3 = aP3;
      pclaprd.this.AV112Discod = aP4[0];
      this.aP4 = aP4;
      pclaprd.this.AV21TotKil = aP5[0];
      this.aP5 = aP5;
      pclaprd.this.AV22PrdDesc = aP6[0];
      this.aP6 = aP6;
      pclaprd.this.AV23Accion = aP7[0];
      this.aP7 = aP7;
      pclaprd.this.AV111Opi = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV23Accion = GXutil.substring( AV16Clave, 11, 1) ;
      AV39Proceso = GXutil.substring( AV16Clave, 4, 6) ;
      AV40FlagPro = (byte)(0) ;
      AV66Station = context.getWorkstationId( remoteHandle) ;
      /* Using cursor P027A2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV112Discod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P027A2_A361DisCod[0] ;
         A252CliCod = P027A2_A252CliCod[0] ;
         A335DisArtCod = P027A2_A335DisArtCod[0] ;
         A362DisColNom = P027A2_A362DisColNom[0] ;
         n362DisColNom = P027A2_n362DisColNom[0] ;
         A363DisColNum = P027A2_A363DisColNum[0] ;
         n363DisColNum = P027A2_n363DisColNum[0] ;
         A390DisTipCol = P027A2_A390DisTipCol[0] ;
         n390DisTipCol = P027A2_n390DisTipCol[0] ;
         AV52CliCod = A252CliCod ;
         AV79BarSer = A335DisArtCod ;
         AV102BarColNom = A362DisColNom ;
         AV113Barcolnum = A363DisColNum ;
         AV114BarTipCol = A390DisTipCol ;
         /* Execute user subroutine: 'LFORMU' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'LFORMU' Routine */
      returnInSub = false ;
      /* Using cursor P027A3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV52CliCod), AV79BarSer, AV102BarColNom, Integer.valueOf(AV113Barcolnum), Byte.valueOf(AV114BarTipCol), AV39Proceso});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A764ProForCod = P027A3_A764ProForCod[0] ;
         A831TipColCod = P027A3_A831TipColCod[0] ;
         A483ForColNum = P027A3_A483ForColNum[0] ;
         A482ForColNom = P027A3_A482ForColNom[0] ;
         A494ForSer = P027A3_A494ForSer[0] ;
         A252CliCod = P027A3_A252CliCod[0] ;
         A1160ProForL = P027A3_A1160ProForL[0] ;
         AV17PrdVal = (byte)(1) ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pclaprd.this.A396EmprCod;
      this.aP1[0] = pclaprd.this.AV15Descrip;
      this.aP2[0] = pclaprd.this.AV16Clave;
      this.aP3[0] = pclaprd.this.AV17PrdVal;
      this.aP4[0] = pclaprd.this.AV112Discod;
      this.aP5[0] = pclaprd.this.AV21TotKil;
      this.aP6[0] = pclaprd.this.AV22PrdDesc;
      this.aP7[0] = pclaprd.this.AV23Accion;
      this.aP8[0] = pclaprd.this.AV111Opi;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV39Proceso = "" ;
      AV66Station = "" ;
      scmdbuf = "" ;
      P027A2_A396EmprCod = new String[] {""} ;
      P027A2_A361DisCod = new int[1] ;
      P027A2_A252CliCod = new int[1] ;
      P027A2_A335DisArtCod = new String[] {""} ;
      P027A2_A362DisColNom = new String[] {""} ;
      P027A2_n362DisColNom = new boolean[] {false} ;
      P027A2_A363DisColNum = new int[1] ;
      P027A2_n363DisColNum = new boolean[] {false} ;
      P027A2_A390DisTipCol = new byte[1] ;
      P027A2_n390DisTipCol = new boolean[] {false} ;
      A335DisArtCod = "" ;
      A362DisColNom = "" ;
      AV79BarSer = "" ;
      AV102BarColNom = "" ;
      P027A3_A396EmprCod = new String[] {""} ;
      P027A3_A764ProForCod = new String[] {""} ;
      P027A3_A831TipColCod = new byte[1] ;
      P027A3_A483ForColNum = new int[1] ;
      P027A3_A482ForColNom = new String[] {""} ;
      P027A3_A494ForSer = new String[] {""} ;
      P027A3_A252CliCod = new int[1] ;
      P027A3_A1160ProForL = new short[1] ;
      A764ProForCod = "" ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclaprd__default(),
         new Object[] {
             new Object[] {
            P027A2_A396EmprCod, P027A2_A361DisCod, P027A2_A252CliCod, P027A2_A335DisArtCod, P027A2_A362DisColNom, P027A2_n362DisColNom, P027A2_A363DisColNum, P027A2_n363DisColNum, P027A2_A390DisTipCol, P027A2_n390DisTipCol
            }
            , new Object[] {
            P027A3_A396EmprCod, P027A3_A764ProForCod, P027A3_A831TipColCod, P027A3_A483ForColNum, P027A3_A482ForColNom, P027A3_A494ForSer, P027A3_A252CliCod, P027A3_A1160ProForL
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17PrdVal ;
   private byte AV111Opi ;
   private byte AV40FlagPro ;
   private byte A390DisTipCol ;
   private byte AV114BarTipCol ;
   private byte A831TipColCod ;
   private short A1160ProForL ;
   private short Gx_err ;
   private int AV112Discod ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A363DisColNum ;
   private int AV52CliCod ;
   private int AV113Barcolnum ;
   private int A483ForColNum ;
   private java.math.BigDecimal AV21TotKil ;
   private String A396EmprCod ;
   private String AV15Descrip ;
   private String AV16Clave ;
   private String AV22PrdDesc ;
   private String AV23Accion ;
   private String AV39Proceso ;
   private String AV66Station ;
   private String scmdbuf ;
   private String A335DisArtCod ;
   private String A362DisColNom ;
   private String AV79BarSer ;
   private String AV102BarColNom ;
   private String A764ProForCod ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private boolean n362DisColNom ;
   private boolean n363DisColNum ;
   private boolean n390DisTipCol ;
   private boolean returnInSub ;
   private byte[] aP8 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private byte[] aP3 ;
   private int[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P027A2_A396EmprCod ;
   private int[] P027A2_A361DisCod ;
   private int[] P027A2_A252CliCod ;
   private String[] P027A2_A335DisArtCod ;
   private String[] P027A2_A362DisColNom ;
   private boolean[] P027A2_n362DisColNom ;
   private int[] P027A2_A363DisColNum ;
   private boolean[] P027A2_n363DisColNum ;
   private byte[] P027A2_A390DisTipCol ;
   private boolean[] P027A2_n390DisTipCol ;
   private String[] P027A3_A396EmprCod ;
   private String[] P027A3_A764ProForCod ;
   private byte[] P027A3_A831TipColCod ;
   private int[] P027A3_A483ForColNum ;
   private String[] P027A3_A482ForColNom ;
   private String[] P027A3_A494ForSer ;
   private int[] P027A3_A252CliCod ;
   private short[] P027A3_A1160ProForL ;
}

final  class pclaprd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P027A2", "SELECT EmprCod, DisCod, CliCod, DisArtCod, DisColNom, DisColNum, DisTipCol FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P027A3", "SELECT EmprCod, ProForCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod, ProForL FROM TXPLFORMU WHERE (EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ?) AND (ProForCod = ?) ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
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
               stmt.setString(7, (String)parms[6], 6);
               return;
      }
   }

}

