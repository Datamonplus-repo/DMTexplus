package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprdsup extends GXProcedure
{
   public pprdsup( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprdsup.class ), "" );
   }

   public pprdsup( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 )
   {
      pprdsup.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 )
   {
      pprdsup.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprdsup.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pprdsup.this.A494ForSer = aP2[0];
      this.aP2 = aP2;
      pprdsup.this.A482ForColNom = aP3[0];
      this.aP3 = aP3;
      pprdsup.this.A483ForColNum = aP4[0];
      this.aP4 = aP4;
      pprdsup.this.A831TipColCod = aP5[0];
      this.aP5 = aP5;
      pprdsup.this.AV8MsgErr = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8MsgErr = " " ;
      /* Using cursor P04TG2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A486ForNumCol = P04TG2_A486ForNumCol[0] ;
         AV9Fornumcol = A486ForNumCol ;
         /* Execute user subroutine: 'LDFORM' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'LPRFORM' */
         S121 ();
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
      /* 'LDFORM' Routine */
      returnInSub = false ;
      AV10Ldform = (byte)(0) ;
      /* Using cursor P04TG3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV9Fornumcol)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A486ForNumCol = P04TG3_A486ForNumCol[0] ;
         A856ValCod = P04TG3_A856ValCod[0] ;
         A718PrdNom = P04TG3_A718PrdNom[0] ;
         A719PrdNum = P04TG3_A719PrdNum[0] ;
         A309ColLin = P04TG3_A309ColLin[0] ;
         A856ValCod = P04TG3_A856ValCod[0] ;
         A718PrdNom = P04TG3_A718PrdNom[0] ;
         if ( A856ValCod == 3 )
         {
            if ( GXutil.strcmp(AV8MsgErr, " ") == 0 )
            {
               AV8MsgErr = httpContext.getMessage( "Colorantes.Producto(s) suprimido(s):", "") + GXutil.newLine( ) ;
               AV8MsgErr += GXutil.trim( A719PrdNum) + " " + GXutil.trim( A718PrdNom) + GXutil.newLine( ) ;
            }
            else
            {
               AV8MsgErr += GXutil.trim( A719PrdNum) + " " + GXutil.trim( A718PrdNom) + GXutil.newLine( ) ;
            }
            AV10Ldform = (byte)(1) ;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void S121( )
   {
      /* 'LPRFORM' Routine */
      returnInSub = false ;
      /* Using cursor P04TG4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV9Fornumcol)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A486ForNumCol = P04TG4_A486ForNumCol[0] ;
         A856ValCod = P04TG4_A856ValCod[0] ;
         A718PrdNom = P04TG4_A718PrdNom[0] ;
         A719PrdNum = P04TG4_A719PrdNum[0] ;
         A715PrdLin = P04TG4_A715PrdLin[0] ;
         A856ValCod = P04TG4_A856ValCod[0] ;
         A718PrdNom = P04TG4_A718PrdNom[0] ;
         if ( A856ValCod == 3 )
         {
            if ( AV10Ldform == 1 )
            {
               AV8MsgErr += "  " + GXutil.newLine( ) ;
               AV8MsgErr += httpContext.getMessage( "Productos.Producto(s) suprimido(s):", "") + GXutil.newLine( ) ;
               AV8MsgErr += GXutil.trim( A719PrdNum) + " " + GXutil.trim( A718PrdNom) + GXutil.newLine( ) ;
            }
            else
            {
               if ( GXutil.strcmp(AV8MsgErr, " ") == 0 )
               {
                  AV8MsgErr = httpContext.getMessage( "Productos.Producto(s) suprimido(s):", "") + GXutil.newLine( ) ;
                  AV8MsgErr += GXutil.trim( A719PrdNum) + " " + GXutil.trim( A718PrdNom) + GXutil.newLine( ) ;
               }
               else
               {
                  AV8MsgErr += GXutil.trim( A719PrdNum) + " " + GXutil.trim( A718PrdNom) + GXutil.newLine( ) ;
               }
            }
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprdsup.this.A396EmprCod;
      this.aP1[0] = pprdsup.this.A252CliCod;
      this.aP2[0] = pprdsup.this.A494ForSer;
      this.aP3[0] = pprdsup.this.A482ForColNom;
      this.aP4[0] = pprdsup.this.A483ForColNum;
      this.aP5[0] = pprdsup.this.A831TipColCod;
      this.aP6[0] = pprdsup.this.AV8MsgErr;
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
      P04TG2_A396EmprCod = new String[] {""} ;
      P04TG2_A252CliCod = new int[1] ;
      P04TG2_A494ForSer = new String[] {""} ;
      P04TG2_A482ForColNom = new String[] {""} ;
      P04TG2_A483ForColNum = new int[1] ;
      P04TG2_A831TipColCod = new byte[1] ;
      P04TG2_A486ForNumCol = new int[1] ;
      P04TG3_A396EmprCod = new String[] {""} ;
      P04TG3_A486ForNumCol = new int[1] ;
      P04TG3_A856ValCod = new byte[1] ;
      P04TG3_A718PrdNom = new String[] {""} ;
      P04TG3_A719PrdNum = new String[] {""} ;
      P04TG3_A309ColLin = new short[1] ;
      A718PrdNom = "" ;
      A719PrdNum = "" ;
      P04TG4_A396EmprCod = new String[] {""} ;
      P04TG4_A486ForNumCol = new int[1] ;
      P04TG4_A856ValCod = new byte[1] ;
      P04TG4_A718PrdNom = new String[] {""} ;
      P04TG4_A719PrdNum = new String[] {""} ;
      P04TG4_A715PrdLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprdsup__default(),
         new Object[] {
             new Object[] {
            P04TG2_A396EmprCod, P04TG2_A252CliCod, P04TG2_A494ForSer, P04TG2_A482ForColNom, P04TG2_A483ForColNum, P04TG2_A831TipColCod, P04TG2_A486ForNumCol
            }
            , new Object[] {
            P04TG3_A396EmprCod, P04TG3_A486ForNumCol, P04TG3_A856ValCod, P04TG3_A718PrdNom, P04TG3_A719PrdNum, P04TG3_A309ColLin
            }
            , new Object[] {
            P04TG4_A396EmprCod, P04TG4_A486ForNumCol, P04TG4_A856ValCod, P04TG4_A718PrdNom, P04TG4_A719PrdNum, P04TG4_A715PrdLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private byte AV10Ldform ;
   private byte A856ValCod ;
   private short A309ColLin ;
   private short A715PrdLin ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int A486ForNumCol ;
   private int AV9Fornumcol ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String scmdbuf ;
   private String A718PrdNom ;
   private String A719PrdNum ;
   private boolean returnInSub ;
   private String AV8MsgErr ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P04TG2_A396EmprCod ;
   private int[] P04TG2_A252CliCod ;
   private String[] P04TG2_A494ForSer ;
   private String[] P04TG2_A482ForColNom ;
   private int[] P04TG2_A483ForColNum ;
   private byte[] P04TG2_A831TipColCod ;
   private int[] P04TG2_A486ForNumCol ;
   private String[] P04TG3_A396EmprCod ;
   private int[] P04TG3_A486ForNumCol ;
   private byte[] P04TG3_A856ValCod ;
   private String[] P04TG3_A718PrdNom ;
   private String[] P04TG3_A719PrdNum ;
   private short[] P04TG3_A309ColLin ;
   private String[] P04TG4_A396EmprCod ;
   private int[] P04TG4_A486ForNumCol ;
   private byte[] P04TG4_A856ValCod ;
   private String[] P04TG4_A718PrdNom ;
   private String[] P04TG4_A719PrdNum ;
   private short[] P04TG4_A715PrdLin ;
}

final  class pprdsup__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04TG2", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForNumCol FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04TG3", "SELECT T1.EmprCod, T1.ForNumCol, T2.ValCod, T2.PrdNom, T1.PrdNum, T1.ColLin FROM (TXPLDFORM T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.ForNumCol = ? ORDER BY T1.EmprCod, T1.ForNumCol, T1.ColLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04TG4", "SELECT T1.EmprCod, T1.ForNumCol, T2.ValCod, T2.PrdNom, T1.PrdNum, T1.PrdLin FROM (TXPLPRFOR T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.ForNumCol = ? ORDER BY T1.EmprCod, T1.ForNumCol, T1.PrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((short[]) buf[5])[0] = rslt.getShort(6);
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
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

