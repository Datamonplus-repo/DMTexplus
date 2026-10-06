package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pccstdval extends GXProcedure
{
   public pccstdval( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pccstdval.class ), "" );
   }

   public pccstdval( int remoteHandle ,
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
                             int aP5 ,
                             short aP6 )
   {
      pccstdval.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        String aP3 ,
                        int aP4 ,
                        int aP5 ,
                        short aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             String aP3 ,
                             int aP4 ,
                             int aP5 ,
                             short aP6 ,
                             String[] aP7 )
   {
      pccstdval.this.A396EmprCod = aP0;
      pccstdval.this.A252CliCod = aP1;
      pccstdval.this.A65ArtCod = aP2;
      pccstdval.this.A4058CCFColNom = aP3;
      pccstdval.this.A4059CCFColNum = aP4;
      pccstdval.this.A4031CCTCod = aP5;
      pccstdval.this.A4034CCTLin = aP6;
      pccstdval.this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P013Q2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4058CCFColNom, Integer.valueOf(A4059CCFColNum), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4060CCSVal = P013Q2_A4060CCSVal[0] ;
         n4060CCSVal = P013Q2_n4060CCSVal[0] ;
         A11483CCSMax = P013Q2_A11483CCSMax[0] ;
         n11483CCSMax = P013Q2_n11483CCSMax[0] ;
         A11482CCSMin = P013Q2_A11482CCSMin[0] ;
         n11482CCSMin = P013Q2_n11482CCSMin[0] ;
         AV13GXLvl2 = (byte)(0) ;
         /* Using cursor P013Q3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), Boolean.valueOf(n4060CCSVal), A4060CCSVal});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A4051CCTVal = P013Q3_A4051CCTVal[0] ;
            A4050CCTValDsc = P013Q3_A4050CCTValDsc[0] ;
            A4049CCTValLin = P013Q3_A4049CCTValLin[0] ;
            AV13GXLvl2 = (byte)(1) ;
            AV9CCValDsc = A4050CCTValDsc ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( AV13GXLvl2 == 0 )
         {
            AV9CCValDsc = A4060CCSVal ;
         }
         AV9CCValDsc = ((GXutil.strcmp(GXutil.trim( A11482CCSMin), "")!=0) ? GXutil.trim( A11482CCSMin)+" - " : "") + ((GXutil.strcmp(GXutil.trim( AV9CCValDsc), "")!=0) ? GXutil.trim( AV9CCValDsc) : "") + ((GXutil.strcmp(GXutil.trim( A11483CCSMax), "")!=0) ? " - "+GXutil.trim( A11483CCSMax) : "") ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP7[0] = pccstdval.this.AV9CCValDsc;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9CCValDsc = "" ;
      scmdbuf = "" ;
      P013Q2_A396EmprCod = new String[] {""} ;
      P013Q2_A252CliCod = new int[1] ;
      P013Q2_A65ArtCod = new String[] {""} ;
      P013Q2_A4058CCFColNom = new String[] {""} ;
      P013Q2_A4059CCFColNum = new int[1] ;
      P013Q2_A4031CCTCod = new int[1] ;
      P013Q2_A4034CCTLin = new short[1] ;
      P013Q2_A4060CCSVal = new String[] {""} ;
      P013Q2_n4060CCSVal = new boolean[] {false} ;
      P013Q2_A11483CCSMax = new String[] {""} ;
      P013Q2_n11483CCSMax = new boolean[] {false} ;
      P013Q2_A11482CCSMin = new String[] {""} ;
      P013Q2_n11482CCSMin = new boolean[] {false} ;
      A4060CCSVal = "" ;
      A11483CCSMax = "" ;
      A11482CCSMin = "" ;
      P013Q3_A396EmprCod = new String[] {""} ;
      P013Q3_A4031CCTCod = new int[1] ;
      P013Q3_A4034CCTLin = new short[1] ;
      P013Q3_A4051CCTVal = new String[] {""} ;
      P013Q3_A4050CCTValDsc = new String[] {""} ;
      P013Q3_A4049CCTValLin = new byte[1] ;
      A4051CCTVal = "" ;
      A4050CCTValDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.pccstdval__default(),
         new Object[] {
             new Object[] {
            P013Q2_A396EmprCod, P013Q2_A252CliCod, P013Q2_A65ArtCod, P013Q2_A4058CCFColNom, P013Q2_A4059CCFColNum, P013Q2_A4031CCTCod, P013Q2_A4034CCTLin, P013Q2_A4060CCSVal, P013Q2_n4060CCSVal, P013Q2_A11483CCSMax,
            P013Q2_n11483CCSMax, P013Q2_A11482CCSMin, P013Q2_n11482CCSMin
            }
            , new Object[] {
            P013Q3_A396EmprCod, P013Q3_A4031CCTCod, P013Q3_A4034CCTLin, P013Q3_A4051CCTVal, P013Q3_A4050CCTValDsc, P013Q3_A4049CCTValLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV13GXLvl2 ;
   private byte A4049CCTValLin ;
   private short A4034CCTLin ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A4059CCFColNum ;
   private int A4031CCTCod ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String A4058CCFColNom ;
   private String AV9CCValDsc ;
   private String scmdbuf ;
   private String A4060CCSVal ;
   private String A11483CCSMax ;
   private String A11482CCSMin ;
   private String A4051CCTVal ;
   private String A4050CCTValDsc ;
   private boolean n4060CCSVal ;
   private boolean n11483CCSMax ;
   private boolean n11482CCSMin ;
   private String[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P013Q2_A396EmprCod ;
   private int[] P013Q2_A252CliCod ;
   private String[] P013Q2_A65ArtCod ;
   private String[] P013Q2_A4058CCFColNom ;
   private int[] P013Q2_A4059CCFColNum ;
   private int[] P013Q2_A4031CCTCod ;
   private short[] P013Q2_A4034CCTLin ;
   private String[] P013Q2_A4060CCSVal ;
   private boolean[] P013Q2_n4060CCSVal ;
   private String[] P013Q2_A11483CCSMax ;
   private boolean[] P013Q2_n11483CCSMax ;
   private String[] P013Q2_A11482CCSMin ;
   private boolean[] P013Q2_n11482CCSMin ;
   private String[] P013Q3_A396EmprCod ;
   private int[] P013Q3_A4031CCTCod ;
   private short[] P013Q3_A4034CCTLin ;
   private String[] P013Q3_A4051CCTVal ;
   private String[] P013Q3_A4050CCTValDsc ;
   private byte[] P013Q3_A4049CCTValLin ;
}

final  class pccstdval__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P013Q2", "SELECT EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum, CCTCod, CCTLin, CCSVal, CCSMax, CCSMin FROM TXPCCSta WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and CCFColNom = ? and CCFColNum = ? and CCTCod = ? and CCTLin = ? ORDER BY EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum, CCTCod, CCTLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P013Q3", "SELECT EmprCod, CCTCod, CCTLin, CCTVal, CCTValDsc, CCTValLin FROM TXPCCDef2 WHERE (EmprCod = ? and CCTCod = ? and CCTLin = ?) AND (CCTVal = ?) ORDER BY EmprCod, CCTCod, CCTLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 40);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 40);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 40);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
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
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 40);
               }
               return;
      }
   }

}

