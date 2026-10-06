package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class existecardinalenprocesoquimico extends GXProcedure
{
   public existecardinalenprocesoquimico( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( existecardinalenprocesoquimico.class ), "" );
   }

   public existecardinalenprocesoquimico( int remoteHandle ,
                                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             String aP3 ,
                             int aP4 ,
                             byte aP5 ,
                             short aP6 ,
                             String aP7 ,
                             short[] aP8 )
   {
      existecardinalenprocesoquimico.this.aP9 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        String aP3 ,
                        int aP4 ,
                        byte aP5 ,
                        short aP6 ,
                        String aP7 ,
                        short[] aP8 ,
                        String[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             String aP3 ,
                             int aP4 ,
                             byte aP5 ,
                             short aP6 ,
                             String aP7 ,
                             short[] aP8 ,
                             String[] aP9 )
   {
      existecardinalenprocesoquimico.this.AV8Emprcod = aP0;
      existecardinalenprocesoquimico.this.AV13clicod = aP1;
      existecardinalenprocesoquimico.this.AV14forser = aP2;
      existecardinalenprocesoquimico.this.AV15Forcolnom = aP3;
      existecardinalenprocesoquimico.this.AV16Forcolnum = aP4;
      existecardinalenprocesoquimico.this.AV17Tipcolcod = aP5;
      existecardinalenprocesoquimico.this.AV20ForPrdNor = aP6;
      existecardinalenprocesoquimico.this.AV21Prdnum = aP7;
      existecardinalenprocesoquimico.this.aP8 = aP8;
      existecardinalenprocesoquimico.this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10Mensaje = "" ;
      AV19existecardinal = (short)(0) ;
      AV9ProForPrd = "#" + GXutil.trim( GXutil.str( AV20ForPrdNor, 4, 0)) ;
      AV27GXLvl4 = (byte)(0) ;
      /* Using cursor P0A7E2 */
      pr_default.execute(0, new Object[] {AV8Emprcod, Integer.valueOf(AV13clicod), AV14forser, AV15Forcolnom, Integer.valueOf(AV16Forcolnum), Byte.valueOf(AV17Tipcolcod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A831TipColCod = P0A7E2_A831TipColCod[0] ;
         A483ForColNum = P0A7E2_A483ForColNum[0] ;
         A482ForColNom = P0A7E2_A482ForColNom[0] ;
         A494ForSer = P0A7E2_A494ForSer[0] ;
         A252CliCod = P0A7E2_A252CliCod[0] ;
         A396EmprCod = P0A7E2_A396EmprCod[0] ;
         A764ProForCod = P0A7E2_A764ProForCod[0] ;
         A1160ProForL = P0A7E2_A1160ProForL[0] ;
         AV27GXLvl4 = (byte)(1) ;
         AV18proforcod = A764ProForCod ;
         /* Execute user subroutine: 'CONTROLCARDINAL' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV19existecardinal == 1 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         AV24lformu = (short)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV27GXLvl4 == 0 )
      {
         AV24lformu = (short)(0) ;
      }
      AV22PrdGruFamId = (byte)(0) ;
      /* Using cursor P0A7E3 */
      pr_default.execute(1, new Object[] {AV8Emprcod, AV21Prdnum});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A719PrdNum = P0A7E3_A719PrdNum[0] ;
         A396EmprCod = P0A7E3_A396EmprCod[0] ;
         A13969PrdGruFamI = P0A7E3_A13969PrdGruFamI[0] ;
         n13969PrdGruFamI = P0A7E3_n13969PrdGruFamI[0] ;
         AV22PrdGruFamId = A13969PrdGruFamI ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      AV23PrdGruFamIdcardinal = (byte)(0) ;
      /* Using cursor P0A7E4 */
      pr_default.execute(2, new Object[] {AV8Emprcod, AV9ProForPrd});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A719PrdNum = P0A7E4_A719PrdNum[0] ;
         A396EmprCod = P0A7E4_A396EmprCod[0] ;
         A13969PrdGruFamI = P0A7E4_A13969PrdGruFamI[0] ;
         n13969PrdGruFamI = P0A7E4_n13969PrdGruFamI[0] ;
         AV23PrdGruFamIdcardinal = A13969PrdGruFamI ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      if ( (0==AV19existecardinal) )
      {
         if ( AV24lformu == 0 )
         {
            AV10Mensaje = httpContext.getMessage( "NO hay procesos quimicos", "") + GXutil.newLine( ) ;
            AV10Mensaje += httpContext.getMessage( "NO podemos auditar ", "") + GXutil.trim( AV9ProForPrd) ;
         }
         else
         {
            AV10Mensaje = httpContext.getMessage( "Aviso. ", "") + GXutil.trim( AV9ProForPrd) + httpContext.getMessage( ", No Existe en Procesos Quimicos.", "") ;
         }
      }
      else
      {
         if ( AV22PrdGruFamId != AV23PrdGruFamIdcardinal )
         {
            AV10Mensaje = GXutil.trim( AV9ProForPrd) + httpContext.getMessage( " ,Familia ", "") + GXutil.trim( GXutil.str( AV23PrdGruFamIdcardinal, 2, 0)) + httpContext.getMessage( " diferente ", "") + GXutil.trim( AV21Prdnum) + httpContext.getMessage( " ,Familia ", "") + GXutil.trim( GXutil.str( AV22PrdGruFamId, 2, 0)) ;
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'CONTROLCARDINAL' Routine */
      returnInSub = false ;
      /* Using cursor P0A7E5 */
      pr_default.execute(3, new Object[] {AV8Emprcod, AV18proforcod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A764ProForCod = P0A7E5_A764ProForCod[0] ;
         A396EmprCod = P0A7E5_A396EmprCod[0] ;
         A770ProForPrd = P0A7E5_A770ProForPrd[0] ;
         A767ProForLin = P0A7E5_A767ProForLin[0] ;
         if ( GXutil.strcmp(GXutil.trim( AV9ProForPrd), GXutil.trim( A770ProForPrd)) == 0 )
         {
            AV19existecardinal = (short)(1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP8[0] = existecardinalenprocesoquimico.this.AV19existecardinal;
      this.aP9[0] = existecardinalenprocesoquimico.this.AV10Mensaje;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10Mensaje = "" ;
      AV9ProForPrd = "" ;
      scmdbuf = "" ;
      P0A7E2_A831TipColCod = new byte[1] ;
      P0A7E2_A483ForColNum = new int[1] ;
      P0A7E2_A482ForColNom = new String[] {""} ;
      P0A7E2_A494ForSer = new String[] {""} ;
      P0A7E2_A252CliCod = new int[1] ;
      P0A7E2_A396EmprCod = new String[] {""} ;
      P0A7E2_A764ProForCod = new String[] {""} ;
      P0A7E2_A1160ProForL = new short[1] ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A396EmprCod = "" ;
      A764ProForCod = "" ;
      AV18proforcod = "" ;
      P0A7E3_A719PrdNum = new String[] {""} ;
      P0A7E3_A396EmprCod = new String[] {""} ;
      P0A7E3_A13969PrdGruFamI = new byte[1] ;
      P0A7E3_n13969PrdGruFamI = new boolean[] {false} ;
      A719PrdNum = "" ;
      P0A7E4_A719PrdNum = new String[] {""} ;
      P0A7E4_A396EmprCod = new String[] {""} ;
      P0A7E4_A13969PrdGruFamI = new byte[1] ;
      P0A7E4_n13969PrdGruFamI = new boolean[] {false} ;
      P0A7E5_A764ProForCod = new String[] {""} ;
      P0A7E5_A396EmprCod = new String[] {""} ;
      P0A7E5_A770ProForPrd = new String[] {""} ;
      P0A7E5_A767ProForLin = new short[1] ;
      A770ProForPrd = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.existecardinalenprocesoquimico__default(),
         new Object[] {
             new Object[] {
            P0A7E2_A831TipColCod, P0A7E2_A483ForColNum, P0A7E2_A482ForColNom, P0A7E2_A494ForSer, P0A7E2_A252CliCod, P0A7E2_A396EmprCod, P0A7E2_A764ProForCod, P0A7E2_A1160ProForL
            }
            , new Object[] {
            P0A7E3_A719PrdNum, P0A7E3_A396EmprCod, P0A7E3_A13969PrdGruFamI, P0A7E3_n13969PrdGruFamI
            }
            , new Object[] {
            P0A7E4_A719PrdNum, P0A7E4_A396EmprCod, P0A7E4_A13969PrdGruFamI, P0A7E4_n13969PrdGruFamI
            }
            , new Object[] {
            P0A7E5_A764ProForCod, P0A7E5_A396EmprCod, P0A7E5_A770ProForPrd, P0A7E5_A767ProForLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17Tipcolcod ;
   private byte AV27GXLvl4 ;
   private byte A831TipColCod ;
   private byte AV22PrdGruFamId ;
   private byte A13969PrdGruFamI ;
   private byte AV23PrdGruFamIdcardinal ;
   private short AV20ForPrdNor ;
   private short AV19existecardinal ;
   private short A1160ProForL ;
   private short AV24lformu ;
   private short A767ProForLin ;
   private short Gx_err ;
   private int AV13clicod ;
   private int AV16Forcolnum ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private String AV8Emprcod ;
   private String AV14forser ;
   private String AV15Forcolnom ;
   private String AV21Prdnum ;
   private String AV9ProForPrd ;
   private String scmdbuf ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A396EmprCod ;
   private String A764ProForCod ;
   private String AV18proforcod ;
   private String A719PrdNum ;
   private String A770ProForPrd ;
   private boolean returnInSub ;
   private boolean n13969PrdGruFamI ;
   private String AV10Mensaje ;
   private String[] aP9 ;
   private short[] aP8 ;
   private IDataStoreProvider pr_default ;
   private byte[] P0A7E2_A831TipColCod ;
   private int[] P0A7E2_A483ForColNum ;
   private String[] P0A7E2_A482ForColNom ;
   private String[] P0A7E2_A494ForSer ;
   private int[] P0A7E2_A252CliCod ;
   private String[] P0A7E2_A396EmprCod ;
   private String[] P0A7E2_A764ProForCod ;
   private short[] P0A7E2_A1160ProForL ;
   private String[] P0A7E3_A719PrdNum ;
   private String[] P0A7E3_A396EmprCod ;
   private byte[] P0A7E3_A13969PrdGruFamI ;
   private boolean[] P0A7E3_n13969PrdGruFamI ;
   private String[] P0A7E4_A719PrdNum ;
   private String[] P0A7E4_A396EmprCod ;
   private byte[] P0A7E4_A13969PrdGruFamI ;
   private boolean[] P0A7E4_n13969PrdGruFamI ;
   private String[] P0A7E5_A764ProForCod ;
   private String[] P0A7E5_A396EmprCod ;
   private String[] P0A7E5_A770ProForPrd ;
   private short[] P0A7E5_A767ProForLin ;
}

final  class existecardinalenprocesoquimico__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A7E2", "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, ProForCod, ProForL FROM TXPLFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A7E3", "SELECT PrdNum, EmprCod, PrdGruFamI FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0A7E4", "SELECT PrdNum, EmprCod, PrdGruFamI FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0A7E5", "SELECT ProForCod, EmprCod, ProForPrd, ProForLin FROM TXPLPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

