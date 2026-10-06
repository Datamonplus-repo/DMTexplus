package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class peliagrr extends GXProcedure
{
   public peliagrr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( peliagrr.class ), "" );
   }

   public peliagrr( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      peliagrr.this.aP3 = new String[] {""};
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
      peliagrr.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      peliagrr.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      peliagrr.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      peliagrr.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02CL2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A120BarAgrEst = P02CL2_A120BarAgrEst[0] ;
         A120BarAgrEst = httpContext.getMessage( "N", "") ;
         /* Using cursor P02CL3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A119BarAgrCod = P02CL3_A119BarAgrCod[0] ;
            A124BarAgrReo = P02CL3_A124BarAgrReo[0] ;
            A122BarAgrPar = P02CL3_A122BarAgrPar[0] ;
            GXv_char1[0] = A396EmprCod ;
            GXv_int2[0] = A129BarCod ;
            GXv_int3[0] = A132BarCodReo ;
            GXv_char4[0] = A130BarCodPar ;
            GXv_int5[0] = A119BarAgrCod ;
            GXv_int6[0] = A124BarAgrReo ;
            GXv_char7[0] = A122BarAgrPar ;
            new app.pelibarr(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_int5, GXv_int6, GXv_char7) ;
            peliagrr.this.A396EmprCod = GXv_char1[0] ;
            peliagrr.this.A129BarCod = GXv_int2[0] ;
            peliagrr.this.A132BarCodReo = GXv_int3[0] ;
            peliagrr.this.A130BarCodPar = GXv_char4[0] ;
            peliagrr.this.A119BarAgrCod = GXv_int5[0] ;
            peliagrr.this.A124BarAgrReo = GXv_int6[0] ;
            peliagrr.this.A122BarAgrPar = GXv_char7[0] ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Using cursor P02CL4 */
         pr_default.execute(2, new Object[] {A120BarAgrEst, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = peliagrr.this.A396EmprCod;
      this.aP1[0] = peliagrr.this.A129BarCod;
      this.aP2[0] = peliagrr.this.A132BarCodReo;
      this.aP3[0] = peliagrr.this.A130BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "peliagrr");
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
      P02CL2_A396EmprCod = new String[] {""} ;
      P02CL2_A129BarCod = new int[1] ;
      P02CL2_A132BarCodReo = new byte[1] ;
      P02CL2_A130BarCodPar = new String[] {""} ;
      P02CL2_A120BarAgrEst = new String[] {""} ;
      A120BarAgrEst = "" ;
      P02CL3_A396EmprCod = new String[] {""} ;
      P02CL3_A129BarCod = new int[1] ;
      P02CL3_A132BarCodReo = new byte[1] ;
      P02CL3_A130BarCodPar = new String[] {""} ;
      P02CL3_A119BarAgrCod = new int[1] ;
      P02CL3_A124BarAgrReo = new byte[1] ;
      P02CL3_A122BarAgrPar = new String[] {""} ;
      A122BarAgrPar = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char7 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.peliagrr__default(),
         new Object[] {
             new Object[] {
            P02CL2_A396EmprCod, P02CL2_A129BarCod, P02CL2_A132BarCodReo, P02CL2_A130BarCodPar, P02CL2_A120BarAgrEst
            }
            , new Object[] {
            P02CL3_A396EmprCod, P02CL3_A129BarCod, P02CL3_A132BarCodReo, P02CL3_A130BarCodPar, P02CL3_A119BarAgrCod, P02CL3_A124BarAgrReo, P02CL3_A122BarAgrPar
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A124BarAgrReo ;
   private byte GXv_int3[] ;
   private byte GXv_int6[] ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A119BarAgrCod ;
   private int GXv_int2[] ;
   private int GXv_int5[] ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A120BarAgrEst ;
   private String A122BarAgrPar ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private String GXv_char7[] ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P02CL2_A396EmprCod ;
   private int[] P02CL2_A129BarCod ;
   private byte[] P02CL2_A132BarCodReo ;
   private String[] P02CL2_A130BarCodPar ;
   private String[] P02CL2_A120BarAgrEst ;
   private String[] P02CL3_A396EmprCod ;
   private int[] P02CL3_A129BarCod ;
   private byte[] P02CL3_A132BarCodReo ;
   private String[] P02CL3_A130BarCodPar ;
   private int[] P02CL3_A119BarAgrCod ;
   private byte[] P02CL3_A124BarAgrReo ;
   private String[] P02CL3_A122BarAgrPar ;
}

final  class peliagrr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02CL2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrEst FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02CL3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02CL4", "UPDATE TXPBARCAD SET BarAgrEst=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

