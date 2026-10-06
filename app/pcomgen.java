package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcomgen extends GXProcedure
{
   public pcomgen( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcomgen.class ), "" );
   }

   public pcomgen( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pcomgen.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 )
   {
      pcomgen.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcomgen.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "Creo DISCOM....", "") );
      /* Using cursor P02BI2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A334DisArtAnh = P02BI2_A334DisArtAnh[0] ;
         A5031DisCom = P02BI2_A5031DisCom[0] ;
         n5031DisCom = P02BI2_n5031DisCom[0] ;
         A350DisArtRdt = P02BI2_A350DisArtRdt[0] ;
         A375DisNumUni = P02BI2_A375DisNumUni[0] ;
         A392DisUniMed = P02BI2_A392DisUniMed[0] ;
         A374DisNumPie = P02BI2_A374DisNumPie[0] ;
         A362DisColNom = P02BI2_A362DisColNom[0] ;
         n362DisColNom = P02BI2_n362DisColNom[0] ;
         A2525DisComULin = P02BI2_A2525DisComULin[0] ;
         n2525DisComULin = P02BI2_n2525DisComULin[0] ;
         /*
            INSERT RECORD ON TABLE TXPDISCOM

         */
         A1057DisComAnh = A334DisArtAnh ;
         n1057DisComAnh = false ;
         A1056DisComCod = A5031DisCom ;
         A2524DisComLin = (byte)(1) ;
         A1058DisComMtr = ((GXutil.strcmp(A392DisUniMed, httpContext.getMessage( "M", ""))==0) ? A375DisNumUni : A375DisNumUni.multiply(A350DisArtRdt)) ;
         n1058DisComMtr = false ;
         A1059DisComPie = A374DisNumPie ;
         n1059DisComPie = false ;
         A1032FonCod = A362DisColNom ;
         /* Using cursor P02BI3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Boolean.valueOf(n1057DisComAnh), Short.valueOf(A1057DisComAnh), Boolean.valueOf(n1058DisComMtr), A1058DisComMtr, Boolean.valueOf(n1059DisComPie), Short.valueOf(A1059DisComPie)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISCOM");
         if ( (pr_default.getStatus(1) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
         A2525DisComULin = (byte)(1) ;
         n2525DisComULin = false ;
         /* Using cursor P02BI4 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n2525DisComULin), Byte.valueOf(A2525DisComULin), A396EmprCod, Integer.valueOf(A361DisCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      System.out.println( httpContext.getMessage( "Fin DISCOM....", "") );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcomgen.this.A396EmprCod;
      this.aP1[0] = pcomgen.this.A361DisCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcomgen");
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
      P02BI2_A396EmprCod = new String[] {""} ;
      P02BI2_A361DisCod = new int[1] ;
      P02BI2_A334DisArtAnh = new short[1] ;
      P02BI2_A5031DisCom = new String[] {""} ;
      P02BI2_n5031DisCom = new boolean[] {false} ;
      P02BI2_A350DisArtRdt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02BI2_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02BI2_A392DisUniMed = new String[] {""} ;
      P02BI2_A374DisNumPie = new short[1] ;
      P02BI2_A362DisColNom = new String[] {""} ;
      P02BI2_n362DisColNom = new boolean[] {false} ;
      P02BI2_A2525DisComULin = new byte[1] ;
      P02BI2_n2525DisComULin = new boolean[] {false} ;
      A5031DisCom = "" ;
      A350DisArtRdt = DecimalUtil.ZERO ;
      A375DisNumUni = DecimalUtil.ZERO ;
      A392DisUniMed = "" ;
      A362DisColNom = "" ;
      A1056DisComCod = "" ;
      A1058DisComMtr = DecimalUtil.ZERO ;
      A1032FonCod = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcomgen__default(),
         new Object[] {
             new Object[] {
            P02BI2_A396EmprCod, P02BI2_A361DisCod, P02BI2_A334DisArtAnh, P02BI2_A5031DisCom, P02BI2_n5031DisCom, P02BI2_A350DisArtRdt, P02BI2_A375DisNumUni, P02BI2_A392DisUniMed, P02BI2_A374DisNumPie, P02BI2_A362DisColNom,
            P02BI2_n362DisColNom, P02BI2_A2525DisComULin, P02BI2_n2525DisComULin
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A2525DisComULin ;
   private byte A2524DisComLin ;
   private short A334DisArtAnh ;
   private short A374DisNumPie ;
   private short A1057DisComAnh ;
   private short A1059DisComPie ;
   private short Gx_err ;
   private int A361DisCod ;
   private int GX_INS551 ;
   private java.math.BigDecimal A350DisArtRdt ;
   private java.math.BigDecimal A375DisNumUni ;
   private java.math.BigDecimal A1058DisComMtr ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A5031DisCom ;
   private String A392DisUniMed ;
   private String A362DisColNom ;
   private String A1056DisComCod ;
   private String A1032FonCod ;
   private String Gx_emsg ;
   private boolean n5031DisCom ;
   private boolean n362DisColNom ;
   private boolean n2525DisComULin ;
   private boolean n1057DisComAnh ;
   private boolean n1058DisComMtr ;
   private boolean n1059DisComPie ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P02BI2_A396EmprCod ;
   private int[] P02BI2_A361DisCod ;
   private short[] P02BI2_A334DisArtAnh ;
   private String[] P02BI2_A5031DisCom ;
   private boolean[] P02BI2_n5031DisCom ;
   private java.math.BigDecimal[] P02BI2_A350DisArtRdt ;
   private java.math.BigDecimal[] P02BI2_A375DisNumUni ;
   private String[] P02BI2_A392DisUniMed ;
   private short[] P02BI2_A374DisNumPie ;
   private String[] P02BI2_A362DisColNom ;
   private boolean[] P02BI2_n362DisColNom ;
   private byte[] P02BI2_A2525DisComULin ;
   private boolean[] P02BI2_n2525DisComULin ;
}

final  class pcomgen__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02BI2", "SELECT EmprCod, DisCod, DisArtAnh, DisCom, DisArtRdt, DisNumUni, DisUniMed, DisNumPie, DisColNom, DisComULin FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02BI3", "INSERT INTO TXPDISCOM(EmprCod, DisCod, DisComLin, DisComCod, FonCod, DisComAnh, DisComMtr, DisComPie, DisComObs, DisComDibC, DisComDibI) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISCOM")
         ,new UpdateCursor("P02BI4", "UPDATE TXPDISPOS SET DisComULin=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 13);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 12);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[6]).shortValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[10]).shortValue());
               }
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
      }
   }

}

