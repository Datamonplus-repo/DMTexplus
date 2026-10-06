package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plock04 extends GXProcedure
{
   public plock04( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plock04.class ), "" );
   }

   public plock04( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      plock04.this.aP3 = new String[] {""};
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
      plock04.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      plock04.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      plock04.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      plock04.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P045B2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5351BarObsGrm = P045B2_A5351BarObsGrm[0] ;
         AV8BarObsgrm = A5351BarObsGrm ;
         A5351BarObsGrm = AV8BarObsgrm ;
         /* Using cursor P045B3 */
         pr_default.execute(1, new Object[] {A5351BarObsGrm, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = plock04.this.A396EmprCod;
      this.aP1[0] = plock04.this.A129BarCod;
      this.aP2[0] = plock04.this.A132BarCodReo;
      this.aP3[0] = plock04.this.A130BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "plock04");
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
      P045B2_A396EmprCod = new String[] {""} ;
      P045B2_A129BarCod = new int[1] ;
      P045B2_A132BarCodReo = new byte[1] ;
      P045B2_A130BarCodPar = new String[] {""} ;
      P045B2_A5351BarObsGrm = new String[] {""} ;
      A5351BarObsGrm = "" ;
      AV8BarObsgrm = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.plock04__default(),
         new Object[] {
             new Object[] {
            P045B2_A396EmprCod, P045B2_A129BarCod, P045B2_A132BarCodReo, P045B2_A130BarCodPar, P045B2_A5351BarObsGrm
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A5351BarObsGrm ;
   private String AV8BarObsgrm ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P045B2_A396EmprCod ;
   private int[] P045B2_A129BarCod ;
   private byte[] P045B2_A132BarCodReo ;
   private String[] P045B2_A130BarCodPar ;
   private String[] P045B2_A5351BarObsGrm ;
}

final  class plock04__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P045B2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarObsGrm FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P045B3", "UPDATE TXPBARCAD SET BarObsGrm=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
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
               stmt.setString(1, (String)parms[0], 20);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

