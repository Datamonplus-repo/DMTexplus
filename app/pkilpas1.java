package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pkilpas1 extends GXProcedure
{
   public pkilpas1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pkilpas1.class ), "" );
   }

   public pkilpas1( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      pkilpas1.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      pkilpas1.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pkilpas1.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pkilpas1.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pkilpas1.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00MM2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A213BarSit = P00MM2_A213BarSit[0] ;
         A180BarMaqCod = P00MM2_A180BarMaqCod[0] ;
         A2759BarMaqGru = P00MM2_A2759BarMaqGru[0] ;
         A2401BarNumPas = P00MM2_A2401BarNumPas[0] ;
         n2401BarNumPas = P00MM2_n2401BarNumPas[0] ;
         A236BarVolMaq = P00MM2_A236BarVolMaq[0] ;
         A1003BarFecLan = P00MM2_A1003BarFecLan[0] ;
         n1003BarFecLan = P00MM2_n1003BarFecLan[0] ;
         if ( A213BarSit < 4 )
         {
            A180BarMaqCod = "" ;
            A2759BarMaqGru = "" ;
            A2401BarNumPas = (byte)(0) ;
            n2401BarNumPas = false ;
            A236BarVolMaq = 0 ;
            A1003BarFecLan = GXutil.nullDate() ;
            n1003BarFecLan = false ;
         }
         /* Using cursor P00MM3 */
         pr_default.execute(1, new Object[] {A180BarMaqCod, A2759BarMaqGru, Boolean.valueOf(n2401BarNumPas), Byte.valueOf(A2401BarNumPas), Integer.valueOf(A236BarVolMaq), Boolean.valueOf(n1003BarFecLan), A1003BarFecLan, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pkilpas1.this.A396EmprCod;
      this.aP1[0] = pkilpas1.this.A129BarCod;
      this.aP2[0] = pkilpas1.this.A132BarCodReo;
      this.aP3[0] = pkilpas1.this.A130BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "pkilpas1");
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
      P00MM2_A396EmprCod = new String[] {""} ;
      P00MM2_A129BarCod = new int[1] ;
      P00MM2_A132BarCodReo = new byte[1] ;
      P00MM2_A130BarCodPar = new String[] {""} ;
      P00MM2_A213BarSit = new byte[1] ;
      P00MM2_A180BarMaqCod = new String[] {""} ;
      P00MM2_A2759BarMaqGru = new String[] {""} ;
      P00MM2_A2401BarNumPas = new byte[1] ;
      P00MM2_n2401BarNumPas = new boolean[] {false} ;
      P00MM2_A236BarVolMaq = new int[1] ;
      P00MM2_A1003BarFecLan = new java.util.Date[] {GXutil.nullDate()} ;
      P00MM2_n1003BarFecLan = new boolean[] {false} ;
      A180BarMaqCod = "" ;
      A2759BarMaqGru = "" ;
      A1003BarFecLan = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pkilpas1__default(),
         new Object[] {
             new Object[] {
            P00MM2_A396EmprCod, P00MM2_A129BarCod, P00MM2_A132BarCodReo, P00MM2_A130BarCodPar, P00MM2_A213BarSit, P00MM2_A180BarMaqCod, P00MM2_A2759BarMaqGru, P00MM2_A2401BarNumPas, P00MM2_n2401BarNumPas, P00MM2_A236BarVolMaq,
            P00MM2_A1003BarFecLan, P00MM2_n1003BarFecLan
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte A2401BarNumPas ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A236BarVolMaq ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A180BarMaqCod ;
   private String A2759BarMaqGru ;
   private java.util.Date A1003BarFecLan ;
   private boolean n2401BarNumPas ;
   private boolean n1003BarFecLan ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P00MM2_A396EmprCod ;
   private int[] P00MM2_A129BarCod ;
   private byte[] P00MM2_A132BarCodReo ;
   private String[] P00MM2_A130BarCodPar ;
   private byte[] P00MM2_A213BarSit ;
   private String[] P00MM2_A180BarMaqCod ;
   private String[] P00MM2_A2759BarMaqGru ;
   private byte[] P00MM2_A2401BarNumPas ;
   private boolean[] P00MM2_n2401BarNumPas ;
   private int[] P00MM2_A236BarVolMaq ;
   private java.util.Date[] P00MM2_A1003BarFecLan ;
   private boolean[] P00MM2_n1003BarFecLan ;
}

final  class pkilpas1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00MM2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarSit, BarMaqCod, BarMaqGru, BarNumPas, BarVolMaq, BarFecLan FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00MM3", "UPDATE TXPBARCAD SET BarMaqCod=?, BarMaqGru=?, BarNumPas=?, BarVolMaq=?, BarFecLan=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 4);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
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
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 4);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[3]).byteValue());
               }
               stmt.setInt(4, ((Number) parms[4]).intValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DATE );
               }
               else
               {
                  stmt.setDate(5, (java.util.Date)parms[6]);
               }
               stmt.setString(6, (String)parms[7], 3);
               stmt.setInt(7, ((Number) parms[8]).intValue());
               stmt.setByte(8, ((Number) parms[9]).byteValue());
               stmt.setString(9, (String)parms[10], 1);
               return;
      }
   }

}

