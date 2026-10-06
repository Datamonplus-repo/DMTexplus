package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppartcol extends GXProcedure
{
   public ppartcol( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppartcol.class ), "" );
   }

   public ppartcol( int remoteHandle ,
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
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             byte[] aP8 )
   {
      ppartcol.this.aP9 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        byte[] aP8 ,
                        String[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             byte[] aP8 ,
                             String[] aP9 )
   {
      ppartcol.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppartcol.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      ppartcol.this.A2141SerEst = aP2[0];
      this.aP2 = aP2;
      ppartcol.this.A1013DibCli = aP3[0];
      this.aP3 = aP3;
      ppartcol.this.A1014DibInt = aP4[0];
      this.aP4 = aP4;
      ppartcol.this.A2074ColCom = aP5[0];
      this.aP5 = aP5;
      ppartcol.this.A2078ColFon = aP6[0];
      this.aP6 = aP6;
      ppartcol.this.AV8Tipo = aP7[0];
      this.aP7 = aP7;
      ppartcol.this.AV9Num = aP8[0];
      this.aP8 = aP8;
      ppartcol.this.AV10Cod = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gx_msg = "" ;
      Gx_msg += httpContext.getMessage( "Tipo = ", "") + GXutil.trim( AV8Tipo) + GXutil.newLine( ) ;
      if ( GXutil.strcmp(AV8Tipo, httpContext.getMessage( "C", "")) == 0 )
      {
         AV10Cod = httpContext.getMessage( "N/F", "") ;
      }
      /* Using cursor P04MF2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2098MolCod = P04MF2_A2098MolCod[0] ;
         A2648MolForEst = P04MF2_A2648MolForEst[0] ;
         n2648MolForEst = P04MF2_n2648MolForEst[0] ;
         A4420MolCol = P04MF2_A4420MolCol[0] ;
         n4420MolCol = P04MF2_n4420MolCol[0] ;
         AV11i = (byte)(AV11i+1) ;
         Gx_msg += httpContext.getMessage( "&i = ", "") + GXutil.trim( GXutil.str( AV11i, 10, 0)) + " (" + GXutil.trim( GXutil.str( AV11i, 10, 0)) + ")." + GXutil.newLine( ) ;
         if ( AV9Num == AV11i )
         {
            Gx_msg += httpContext.getMessage( "=> Activo = ", "") + GXutil.trim( A2648MolForEst) + GXutil.newLine( ) ;
            if ( GXutil.strcmp(A2648MolForEst, httpContext.getMessage( "S", "")) == 0 )
            {
               if ( GXutil.strcmp(AV8Tipo, httpContext.getMessage( "C", "")) == 0 )
               {
                  AV10Cod = A4420MolCol ;
                  Gx_msg += httpContext.getMessage( "==> Color = ", "") + GXutil.trim( AV10Cod) + GXutil.newLine( ) ;
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               else
               {
                  /* Using cursor P04MF3 */
                  pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod)});
                  while ( (pr_default.getStatus(1) != 101) )
                  {
                     A2107PasCod = P04MF3_A2107PasCod[0] ;
                     n2107PasCod = P04MF3_n2107PasCod[0] ;
                     A2654PasForLin = P04MF3_A2654PasForLin[0] ;
                     AV10Cod = A2107PasCod ;
                     Gx_msg += httpContext.getMessage( "==> Pasta = ", "") + GXutil.trim( AV10Cod) + GXutil.newLine( ) ;
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                     pr_default.readNext(1);
                  }
                  pr_default.close(1);
               }
            }
            else
            {
               if ( GXutil.strcmp(AV8Tipo, httpContext.getMessage( "C", "")) == 0 )
               {
                  AV10Cod = httpContext.getMessage( "FONDO", "") ;
                  Gx_msg += httpContext.getMessage( "==> Fondo", "") + GXutil.newLine( ) ;
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      Gx_msg += httpContext.getMessage( "==> Salida = ", "") + GXutil.trim( AV10Cod) + GXutil.newLine( ) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppartcol.this.A396EmprCod;
      this.aP1[0] = ppartcol.this.A252CliCod;
      this.aP2[0] = ppartcol.this.A2141SerEst;
      this.aP3[0] = ppartcol.this.A1013DibCli;
      this.aP4[0] = ppartcol.this.A1014DibInt;
      this.aP5[0] = ppartcol.this.A2074ColCom;
      this.aP6[0] = ppartcol.this.A2078ColFon;
      this.aP7[0] = ppartcol.this.AV8Tipo;
      this.aP8[0] = ppartcol.this.AV9Num;
      this.aP9[0] = ppartcol.this.AV10Cod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gx_msg = "" ;
      scmdbuf = "" ;
      P04MF2_A396EmprCod = new String[] {""} ;
      P04MF2_A252CliCod = new int[1] ;
      P04MF2_A2141SerEst = new String[] {""} ;
      P04MF2_A1013DibCli = new String[] {""} ;
      P04MF2_A1014DibInt = new int[1] ;
      P04MF2_A2074ColCom = new String[] {""} ;
      P04MF2_A2078ColFon = new String[] {""} ;
      P04MF2_A2098MolCod = new byte[1] ;
      P04MF2_A2648MolForEst = new String[] {""} ;
      P04MF2_n2648MolForEst = new boolean[] {false} ;
      P04MF2_A4420MolCol = new String[] {""} ;
      P04MF2_n4420MolCol = new boolean[] {false} ;
      A2648MolForEst = "" ;
      A4420MolCol = "" ;
      P04MF3_A396EmprCod = new String[] {""} ;
      P04MF3_A252CliCod = new int[1] ;
      P04MF3_A2141SerEst = new String[] {""} ;
      P04MF3_A1013DibCli = new String[] {""} ;
      P04MF3_A1014DibInt = new int[1] ;
      P04MF3_A2074ColCom = new String[] {""} ;
      P04MF3_A2078ColFon = new String[] {""} ;
      P04MF3_A2098MolCod = new byte[1] ;
      P04MF3_A2107PasCod = new String[] {""} ;
      P04MF3_n2107PasCod = new boolean[] {false} ;
      P04MF3_A2654PasForLin = new short[1] ;
      A2107PasCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppartcol__default(),
         new Object[] {
             new Object[] {
            P04MF2_A396EmprCod, P04MF2_A252CliCod, P04MF2_A2141SerEst, P04MF2_A1013DibCli, P04MF2_A1014DibInt, P04MF2_A2074ColCom, P04MF2_A2078ColFon, P04MF2_A2098MolCod, P04MF2_A2648MolForEst, P04MF2_n2648MolForEst,
            P04MF2_A4420MolCol, P04MF2_n4420MolCol
            }
            , new Object[] {
            P04MF3_A396EmprCod, P04MF3_A252CliCod, P04MF3_A2141SerEst, P04MF3_A1013DibCli, P04MF3_A1014DibInt, P04MF3_A2074ColCom, P04MF3_A2078ColFon, P04MF3_A2098MolCod, P04MF3_A2107PasCod, P04MF3_n2107PasCod,
            P04MF3_A2654PasForLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9Num ;
   private byte A2098MolCod ;
   private byte AV11i ;
   private short A2654PasForLin ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A1014DibInt ;
   private String A396EmprCod ;
   private String A2141SerEst ;
   private String A1013DibCli ;
   private String A2074ColCom ;
   private String A2078ColFon ;
   private String AV8Tipo ;
   private String AV10Cod ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A2648MolForEst ;
   private String A4420MolCol ;
   private String A2107PasCod ;
   private boolean n2648MolForEst ;
   private boolean n4420MolCol ;
   private boolean n2107PasCod ;
   private String[] aP9 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private byte[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P04MF2_A396EmprCod ;
   private int[] P04MF2_A252CliCod ;
   private String[] P04MF2_A2141SerEst ;
   private String[] P04MF2_A1013DibCli ;
   private int[] P04MF2_A1014DibInt ;
   private String[] P04MF2_A2074ColCom ;
   private String[] P04MF2_A2078ColFon ;
   private byte[] P04MF2_A2098MolCod ;
   private String[] P04MF2_A2648MolForEst ;
   private boolean[] P04MF2_n2648MolForEst ;
   private String[] P04MF2_A4420MolCol ;
   private boolean[] P04MF2_n4420MolCol ;
   private String[] P04MF3_A396EmprCod ;
   private int[] P04MF3_A252CliCod ;
   private String[] P04MF3_A2141SerEst ;
   private String[] P04MF3_A1013DibCli ;
   private int[] P04MF3_A1014DibInt ;
   private String[] P04MF3_A2074ColCom ;
   private String[] P04MF3_A2078ColFon ;
   private byte[] P04MF3_A2098MolCod ;
   private String[] P04MF3_A2107PasCod ;
   private boolean[] P04MF3_n2107PasCod ;
   private short[] P04MF3_A2654PasForLin ;
}

final  class ppartcol__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04MF2", "SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, MolForEst, MolCol FROM TXPMFORES WHERE EmprCod = ? and CliCod = ? and SerEst = ? and DibCli = ? and DibInt = ? and ColCom = ? and ColFon = ? ORDER BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04MF3", "SELECT * FROM (SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, PasCod, PasForLin FROM TXPPASFOR WHERE EmprCod = ? and CliCod = ? and SerEst = ? and DibCli = ? and DibInt = ? and ColCom = ? and ColFon = ? and MolCod = ? ORDER BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 20);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(10);
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
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
      }
   }

}

