package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmodpre extends GXProcedure
{
   public pmodpre( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmodpre.class ), "" );
   }

   public pmodpre( int remoteHandle ,
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
                             byte[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             String[] aP8 ,
                             byte[] aP9 )
   {
      pmodpre.this.aP10 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        String[] aP8 ,
                        byte[] aP9 ,
                        String[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             String[] aP8 ,
                             byte[] aP9 ,
                             String[] aP10 )
   {
      pmodpre.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmodpre.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pmodpre.this.A494ForSer = aP2[0];
      this.aP2 = aP2;
      pmodpre.this.A482ForColNom = aP3[0];
      this.aP3 = aP3;
      pmodpre.this.A483ForColNum = aP4[0];
      this.aP4 = aP4;
      pmodpre.this.A831TipColCod = aP5[0];
      this.aP5 = aP5;
      pmodpre.this.AV15NewPreKgm = aP6[0];
      this.aP6 = aP6;
      pmodpre.this.AV16NewPreMtr = aP7[0];
      this.aP7 = aP7;
      pmodpre.this.AV17NewPreDef = aP8[0];
      this.aP8 = aP8;
      pmodpre.this.AV21IntCodF = aP9[0];
      this.aP9 = aP9;
      pmodpre.this.AV22Forobsfac = aP10[0];
      this.aP10 = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV19FecPAnt = (byte)(0) ;
      GXv_int1[0] = AV19FecPAnt ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FECANT", ""), GXv_int1) ;
      pmodpre.this.AV19FecPAnt = GXv_int1[0] ;
      GXt_int2 = AV20F_moda21 ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int1) ;
      pmodpre.this.GXt_int2 = GXv_int1[0] ;
      AV20F_moda21 = GXt_int2 ;
      /* Using cursor P00192 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A492ForPreKgm = P00192_A492ForPreKgm[0] ;
         n492ForPreKgm = P00192_n492ForPreKgm[0] ;
         A493ForPreMtr = P00192_A493ForPreMtr[0] ;
         n493ForPreMtr = P00192_n493ForPreMtr[0] ;
         A491ForPreDef = P00192_A491ForPreDef[0] ;
         n491ForPreDef = P00192_n491ForPreDef[0] ;
         A3585ForPreFec = P00192_A3585ForPreFec[0] ;
         n3585ForPreFec = P00192_n3585ForPreFec[0] ;
         A3587ForFecAnt = P00192_A3587ForFecAnt[0] ;
         n3587ForFecAnt = P00192_n3587ForFecAnt[0] ;
         A5362IntCodF = P00192_A5362IntCodF[0] ;
         n5362IntCodF = P00192_n5362IntCodF[0] ;
         A12732ForObsFac = P00192_A12732ForObsFac[0] ;
         n12732ForObsFac = P00192_n12732ForObsFac[0] ;
         A492ForPreKgm = AV15NewPreKgm ;
         n492ForPreKgm = false ;
         A493ForPreMtr = AV16NewPreMtr ;
         n493ForPreMtr = false ;
         A491ForPreDef = AV17NewPreDef ;
         n491ForPreDef = false ;
         if ( AV19FecPAnt == 1 )
         {
            A3587ForFecAnt = A3585ForPreFec ;
            n3587ForFecAnt = false ;
            A3585ForPreFec = GXutil.serverDate( context, remoteHandle, pr_default) ;
            n3585ForPreFec = false ;
         }
         if ( AV20F_moda21 == 1 )
         {
            A3585ForPreFec = GXutil.today( ) ;
            n3585ForPreFec = false ;
         }
         A5362IntCodF = AV21IntCodF ;
         n5362IntCodF = false ;
         A12732ForObsFac = AV22Forobsfac ;
         n12732ForObsFac = false ;
         /* Using cursor P00193 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n492ForPreKgm), A492ForPreKgm, Boolean.valueOf(n493ForPreMtr), A493ForPreMtr, Boolean.valueOf(n491ForPreDef), A491ForPreDef, Boolean.valueOf(n3585ForPreFec), A3585ForPreFec, Boolean.valueOf(n3587ForFecAnt), A3587ForFecAnt, Boolean.valueOf(n5362IntCodF), Byte.valueOf(A5362IntCodF), Boolean.valueOf(n12732ForObsFac), A12732ForObsFac, A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORMU");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmodpre.this.A396EmprCod;
      this.aP1[0] = pmodpre.this.A252CliCod;
      this.aP2[0] = pmodpre.this.A494ForSer;
      this.aP3[0] = pmodpre.this.A482ForColNom;
      this.aP4[0] = pmodpre.this.A483ForColNum;
      this.aP5[0] = pmodpre.this.A831TipColCod;
      this.aP6[0] = pmodpre.this.AV15NewPreKgm;
      this.aP7[0] = pmodpre.this.AV16NewPreMtr;
      this.aP8[0] = pmodpre.this.AV17NewPreDef;
      this.aP9[0] = pmodpre.this.AV21IntCodF;
      this.aP10[0] = pmodpre.this.AV22Forobsfac;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmodpre");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new byte[1] ;
      scmdbuf = "" ;
      P00192_A396EmprCod = new String[] {""} ;
      P00192_A252CliCod = new int[1] ;
      P00192_A494ForSer = new String[] {""} ;
      P00192_A482ForColNom = new String[] {""} ;
      P00192_A483ForColNum = new int[1] ;
      P00192_A831TipColCod = new byte[1] ;
      P00192_A492ForPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00192_n492ForPreKgm = new boolean[] {false} ;
      P00192_A493ForPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00192_n493ForPreMtr = new boolean[] {false} ;
      P00192_A491ForPreDef = new String[] {""} ;
      P00192_n491ForPreDef = new boolean[] {false} ;
      P00192_A3585ForPreFec = new java.util.Date[] {GXutil.nullDate()} ;
      P00192_n3585ForPreFec = new boolean[] {false} ;
      P00192_A3587ForFecAnt = new java.util.Date[] {GXutil.nullDate()} ;
      P00192_n3587ForFecAnt = new boolean[] {false} ;
      P00192_A5362IntCodF = new byte[1] ;
      P00192_n5362IntCodF = new boolean[] {false} ;
      P00192_A12732ForObsFac = new String[] {""} ;
      P00192_n12732ForObsFac = new boolean[] {false} ;
      A492ForPreKgm = DecimalUtil.ZERO ;
      A493ForPreMtr = DecimalUtil.ZERO ;
      A491ForPreDef = "" ;
      A3585ForPreFec = GXutil.nullDate() ;
      A3587ForFecAnt = GXutil.nullDate() ;
      A12732ForObsFac = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmodpre__default(),
         new Object[] {
             new Object[] {
            P00192_A396EmprCod, P00192_A252CliCod, P00192_A494ForSer, P00192_A482ForColNom, P00192_A483ForColNum, P00192_A831TipColCod, P00192_A492ForPreKgm, P00192_n492ForPreKgm, P00192_A493ForPreMtr, P00192_n493ForPreMtr,
            P00192_A491ForPreDef, P00192_n491ForPreDef, P00192_A3585ForPreFec, P00192_n3585ForPreFec, P00192_A3587ForFecAnt, P00192_n3587ForFecAnt, P00192_A5362IntCodF, P00192_n5362IntCodF, P00192_A12732ForObsFac, P00192_n12732ForObsFac
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private byte AV21IntCodF ;
   private byte AV19FecPAnt ;
   private byte AV20F_moda21 ;
   private byte GXt_int2 ;
   private byte GXv_int1[] ;
   private byte A5362IntCodF ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private java.math.BigDecimal AV15NewPreKgm ;
   private java.math.BigDecimal AV16NewPreMtr ;
   private java.math.BigDecimal A492ForPreKgm ;
   private java.math.BigDecimal A493ForPreMtr ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String AV17NewPreDef ;
   private String scmdbuf ;
   private String A491ForPreDef ;
   private java.util.Date A3585ForPreFec ;
   private java.util.Date A3587ForFecAnt ;
   private boolean n492ForPreKgm ;
   private boolean n493ForPreMtr ;
   private boolean n491ForPreDef ;
   private boolean n3585ForPreFec ;
   private boolean n3587ForFecAnt ;
   private boolean n5362IntCodF ;
   private boolean n12732ForObsFac ;
   private String AV22Forobsfac ;
   private String A12732ForObsFac ;
   private String[] aP10 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private String[] aP8 ;
   private byte[] aP9 ;
   private IDataStoreProvider pr_default ;
   private String[] P00192_A396EmprCod ;
   private int[] P00192_A252CliCod ;
   private String[] P00192_A494ForSer ;
   private String[] P00192_A482ForColNom ;
   private int[] P00192_A483ForColNum ;
   private byte[] P00192_A831TipColCod ;
   private java.math.BigDecimal[] P00192_A492ForPreKgm ;
   private boolean[] P00192_n492ForPreKgm ;
   private java.math.BigDecimal[] P00192_A493ForPreMtr ;
   private boolean[] P00192_n493ForPreMtr ;
   private String[] P00192_A491ForPreDef ;
   private boolean[] P00192_n491ForPreDef ;
   private java.util.Date[] P00192_A3585ForPreFec ;
   private boolean[] P00192_n3585ForPreFec ;
   private java.util.Date[] P00192_A3587ForFecAnt ;
   private boolean[] P00192_n3587ForFecAnt ;
   private byte[] P00192_A5362IntCodF ;
   private boolean[] P00192_n5362IntCodF ;
   private String[] P00192_A12732ForObsFac ;
   private boolean[] P00192_n12732ForObsFac ;
}

final  class pmodpre__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00192", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForPreKgm, ForPreMtr, ForPreDef, ForPreFec, ForFecAnt, IntCodF, ForObsFac FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00193", "UPDATE TXPCFORMU SET ForPreKgm=?, ForPreMtr=?, ForPreDef=?, ForPreFec=?, ForFecAnt=?, IntCodF=?, ForObsFac=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFORMU")
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
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(11);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(12);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(13);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 5);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 5);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DATE );
               }
               else
               {
                  stmt.setDate(4, (java.util.Date)parms[7]);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DATE );
               }
               else
               {
                  stmt.setDate(5, (java.util.Date)parms[9]);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[11]).byteValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[13], 200);
               }
               stmt.setString(8, (String)parms[14], 3);
               stmt.setInt(9, ((Number) parms[15]).intValue());
               stmt.setString(10, (String)parms[16], 16);
               stmt.setString(11, (String)parms[17], 13);
               stmt.setInt(12, ((Number) parms[18]).intValue());
               stmt.setByte(13, ((Number) parms[19]).byteValue());
               return;
      }
   }

}

