package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfacmay extends GXProcedure
{
   public pfacmay( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfacmay.class ), "" );
   }

   public pfacmay( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 )
   {
      pfacmay.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             byte[] aP3 )
   {
      pfacmay.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfacmay.this.AV9FacCod = aP1[0];
      this.aP1 = aP1;
      pfacmay.this.AV10factipfac = aP2[0];
      this.aP2 = aP2;
      pfacmay.this.AV8FacMay = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13GXLvl2 = (byte)(0) ;
      /* Using cursor P02K02 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV9FacCod), Byte.valueOf(AV10factipfac)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1153FacTipFac = P02K02_A1153FacTipFac[0] ;
         A430FacCod = P02K02_A430FacCod[0] ;
         A436FacFch = P02K02_A436FacFch[0] ;
         if ( GXutil.year( A436FacFch) == GXutil.year( GXutil.today( )) )
         {
            AV13GXLvl2 = (byte)(1) ;
            AV8FacMay = (byte)(0) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV13GXLvl2 == 0 )
      {
         AV8FacMay = (byte)(1) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfacmay.this.A396EmprCod;
      this.aP1[0] = pfacmay.this.AV9FacCod;
      this.aP2[0] = pfacmay.this.AV10factipfac;
      this.aP3[0] = pfacmay.this.AV8FacMay;
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
      P02K02_A396EmprCod = new String[] {""} ;
      P02K02_A1153FacTipFac = new byte[1] ;
      P02K02_A430FacCod = new int[1] ;
      P02K02_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      A436FacFch = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfacmay__default(),
         new Object[] {
             new Object[] {
            P02K02_A396EmprCod, P02K02_A1153FacTipFac, P02K02_A430FacCod, P02K02_A436FacFch
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10factipfac ;
   private byte AV8FacMay ;
   private byte AV13GXLvl2 ;
   private byte A1153FacTipFac ;
   private short Gx_err ;
   private int AV9FacCod ;
   private int A430FacCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private java.util.Date A436FacFch ;
   private byte[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P02K02_A396EmprCod ;
   private byte[] P02K02_A1153FacTipFac ;
   private int[] P02K02_A430FacCod ;
   private java.util.Date[] P02K02_A436FacFch ;
}

final  class pfacmay__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02K02", "SELECT EmprCod, FacTipFac, FacCod, FacFch FROM TXPCFAVEN WHERE (EmprCod = ? and FacCod > ?) AND (FacTipFac = ?) ORDER BY EmprCod, FacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
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
               return;
      }
   }

}

