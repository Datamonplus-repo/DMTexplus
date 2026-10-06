package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfacrecl extends GXProcedure
{
   public pfacrecl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfacrecl.class ), "" );
   }

   public pfacrecl( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             byte[] aP1 ,
                             int[] aP2 ,
                             java.util.Date[] aP3 )
   {
      pfacrecl.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        byte[] aP1 ,
                        int[] aP2 ,
                        java.util.Date[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             byte[] aP1 ,
                             int[] aP2 ,
                             java.util.Date[] aP3 ,
                             String[] aP4 )
   {
      pfacrecl.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfacrecl.this.AV8Factipfac = aP1[0];
      this.aP1 = aP1;
      pfacrecl.this.AV12FaccodOr = aP2[0];
      this.aP2 = aP2;
      pfacrecl.this.AV10facFch = aP3[0];
      this.aP3 = aP3;
      pfacrecl.this.AV11facPri = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P03RA2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Byte.valueOf(AV8Factipfac), AV11facPri});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1153FacTipFac = P03RA2_A1153FacTipFac[0] ;
         A450FacPri = P03RA2_A450FacPri[0] ;
         A436FacFch = P03RA2_A436FacFch[0] ;
         A430FacCod = P03RA2_A430FacCod[0] ;
         if ( GXutil.year( A436FacFch) == GXutil.year( GXutil.today( )) )
         {
            AV12FaccodOr = A430FacCod ;
            AV10facFch = A436FacFch ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfacrecl.this.A396EmprCod;
      this.aP1[0] = pfacrecl.this.AV8Factipfac;
      this.aP2[0] = pfacrecl.this.AV12FaccodOr;
      this.aP3[0] = pfacrecl.this.AV10facFch;
      this.aP4[0] = pfacrecl.this.AV11facPri;
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
      P03RA2_A396EmprCod = new String[] {""} ;
      P03RA2_A1153FacTipFac = new byte[1] ;
      P03RA2_A450FacPri = new String[] {""} ;
      P03RA2_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      P03RA2_A430FacCod = new int[1] ;
      A450FacPri = "" ;
      A436FacFch = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfacrecl__default(),
         new Object[] {
             new Object[] {
            P03RA2_A396EmprCod, P03RA2_A1153FacTipFac, P03RA2_A450FacPri, P03RA2_A436FacFch, P03RA2_A430FacCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8Factipfac ;
   private byte A1153FacTipFac ;
   private short Gx_err ;
   private int AV12FaccodOr ;
   private int A430FacCod ;
   private String A396EmprCod ;
   private String AV11facPri ;
   private String scmdbuf ;
   private String A450FacPri ;
   private java.util.Date AV10facFch ;
   private java.util.Date A436FacFch ;
   private String[] aP4 ;
   private String[] aP0 ;
   private byte[] aP1 ;
   private int[] aP2 ;
   private java.util.Date[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P03RA2_A396EmprCod ;
   private byte[] P03RA2_A1153FacTipFac ;
   private String[] P03RA2_A450FacPri ;
   private java.util.Date[] P03RA2_A436FacFch ;
   private int[] P03RA2_A430FacCod ;
}

final  class pfacrecl__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03RA2", "SELECT EmprCod, FacTipFac, FacPri, FacFch, FacCod FROM TXPCFAVEN WHERE EmprCod = ? and FacTipFac = ? and FacPri = ? ORDER BY EmprCod, FacTipFac, FacPri, FacCod DESC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
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
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
      }
   }

}

