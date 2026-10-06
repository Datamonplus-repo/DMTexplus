package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcolest extends GXProcedure
{
   public pcolest( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcolest.class ), "" );
   }

   public pcolest( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      pcolest.this.aP3 = new String[] {""};
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
      pcolest.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcolest.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pcolest.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pcolest.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P03OX2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2010BarTipDis = P03OX2_A2010BarTipDis[0] ;
         A5351BarObsGrm = P03OX2_A5351BarObsGrm[0] ;
         A135BarColNom = P03OX2_A135BarColNom[0] ;
         A136BarColNum = P03OX2_A136BarColNum[0] ;
         if ( GXutil.strcmp(A2010BarTipDis, httpContext.getMessage( "S", "")) == 0 )
         {
            A135BarColNom = GXutil.substring( A5351BarObsGrm, 1, 13) ;
            A136BarColNum = (int)(GXutil.lval( GXutil.substring( A5351BarObsGrm, 14, 6))) ;
         }
         /* Using cursor P03OX3 */
         pr_default.execute(1, new Object[] {A135BarColNom, Integer.valueOf(A136BarColNum), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcolest.this.A396EmprCod;
      this.aP1[0] = pcolest.this.A129BarCod;
      this.aP2[0] = pcolest.this.A132BarCodReo;
      this.aP3[0] = pcolest.this.A130BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcolest");
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
      P03OX2_A396EmprCod = new String[] {""} ;
      P03OX2_A129BarCod = new int[1] ;
      P03OX2_A132BarCodReo = new byte[1] ;
      P03OX2_A130BarCodPar = new String[] {""} ;
      P03OX2_A2010BarTipDis = new String[] {""} ;
      P03OX2_A5351BarObsGrm = new String[] {""} ;
      P03OX2_A135BarColNom = new String[] {""} ;
      P03OX2_A136BarColNum = new int[1] ;
      A2010BarTipDis = "" ;
      A5351BarObsGrm = "" ;
      A135BarColNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcolest__default(),
         new Object[] {
             new Object[] {
            P03OX2_A396EmprCod, P03OX2_A129BarCod, P03OX2_A132BarCodReo, P03OX2_A130BarCodPar, P03OX2_A2010BarTipDis, P03OX2_A5351BarObsGrm, P03OX2_A135BarColNom, P03OX2_A136BarColNum
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
   private int A136BarColNum ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A2010BarTipDis ;
   private String A5351BarObsGrm ;
   private String A135BarColNom ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P03OX2_A396EmprCod ;
   private int[] P03OX2_A129BarCod ;
   private byte[] P03OX2_A132BarCodReo ;
   private String[] P03OX2_A130BarCodPar ;
   private String[] P03OX2_A2010BarTipDis ;
   private String[] P03OX2_A5351BarObsGrm ;
   private String[] P03OX2_A135BarColNom ;
   private int[] P03OX2_A136BarColNum ;
}

final  class pcolest__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03OX2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarTipDis, BarObsGrm, BarColNom, BarColNum FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P03OX3", "UPDATE TXPBARCAD SET BarColNom=?, BarColNum=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((int[]) buf[7])[0] = rslt.getInt(8);
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
               stmt.setString(1, (String)parms[0], 13);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
      }
   }

}

