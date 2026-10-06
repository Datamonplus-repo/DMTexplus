package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnormas extends GXProcedure
{
   public pnormas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnormas.class ), "" );
   }

   public pnormas( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pnormas.this.aP1 = new int[] {0};
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
      pnormas.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pnormas.this.AV8Discod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P05TO2 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13217NormaID = P05TO2_A13217NormaID[0] ;
         W396EmprCod = A396EmprCod ;
         /*
            INSERT RECORD ON TABLE TXPDISNOR

         */
         W396EmprCod = A396EmprCod ;
         A361DisCod = AV8Discod ;
         A13213DisNormID = A13217NormaID ;
         A13214DisNormSt = httpContext.getMessage( "N", "") ;
         A13215DisNormNC = httpContext.getMessage( "N", "") ;
         /* Using cursor P05TO3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A13213DisNormID, A13214DisNormSt, A13215DisNormNC});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISNOR");
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
         A396EmprCod = W396EmprCod ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnormas.this.A396EmprCod;
      this.aP1[0] = pnormas.this.AV8Discod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pnormas");
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
      P05TO2_A396EmprCod = new String[] {""} ;
      P05TO2_A13217NormaID = new String[] {""} ;
      A13217NormaID = "" ;
      W396EmprCod = "" ;
      A13213DisNormID = "" ;
      A13214DisNormSt = "" ;
      A13215DisNormNC = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnormas__default(),
         new Object[] {
             new Object[] {
            P05TO2_A396EmprCod, P05TO2_A13217NormaID
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV8Discod ;
   private int GX_INS1812 ;
   private int A361DisCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A13217NormaID ;
   private String W396EmprCod ;
   private String A13213DisNormID ;
   private String A13214DisNormSt ;
   private String A13215DisNormNC ;
   private String Gx_emsg ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P05TO2_A396EmprCod ;
   private String[] P05TO2_A13217NormaID ;
}

final  class pnormas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05TO2", "SELECT EmprCod, NormaID FROM TXPNORMAS WHERE EmprCod = ? ORDER BY EmprCod, NormaID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05TO3", "INSERT INTO TXPDISNOR(EmprCod, DisCod, DisNormID, DisNormSt, DisNormNC) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISNOR")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 4);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

