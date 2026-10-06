package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdumqfs extends GXProcedure
{
   public pdumqfs( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdumqfs.class ), "" );
   }

   public pdumqfs( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 )
   {
      pdumqfs.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      pdumqfs.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdumqfs.this.A602MaqCod = aP1[0];
      this.aP1 = aP1;
      pdumqfs.this.AV15MaqD = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00L12 */
      pr_default.execute(0, new Object[] {A396EmprCod, A602MaqCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1142MaqFCod = P00L12_A1142MaqFCod[0] ;
         A1143MaqFDsc = P00L12_A1143MaqFDsc[0] ;
         W602MaqCod = A602MaqCod ;
         AV17MaqFCod = A1142MaqFCod ;
         GXt_char1 = AV18FasActiva ;
         GXv_char2[0] = GXt_char1 ;
         new app.faseactiva(remoteHandle, context).execute( A396EmprCod, A1142MaqFCod, GXv_char2) ;
         pdumqfs.this.GXt_char1 = GXv_char2[0] ;
         AV18FasActiva = GXt_char1 ;
         if ( GXutil.strcmp(AV18FasActiva, "S") == 0 )
         {
            /*
               INSERT RECORD ON TABLE TXPMAQFAS

            */
            W602MaqCod = A602MaqCod ;
            W1142MaqFCod = A1142MaqFCod ;
            A602MaqCod = AV15MaqD ;
            A1142MaqFCod = AV17MaqFCod ;
            /* Using cursor P00L13 */
            pr_default.execute(1, new Object[] {A396EmprCod, A602MaqCod, A1142MaqFCod, A1143MaqFDsc});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQFAS");
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
            A602MaqCod = W602MaqCod ;
            A1142MaqFCod = W1142MaqFCod ;
            /* End Insert */
         }
         A602MaqCod = W602MaqCod ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdumqfs.this.A396EmprCod;
      this.aP1[0] = pdumqfs.this.A602MaqCod;
      this.aP2[0] = pdumqfs.this.AV15MaqD;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdumqfs");
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
      P00L12_A396EmprCod = new String[] {""} ;
      P00L12_A602MaqCod = new String[] {""} ;
      P00L12_A1142MaqFCod = new String[] {""} ;
      P00L12_A1143MaqFDsc = new String[] {""} ;
      A1142MaqFCod = "" ;
      A1143MaqFDsc = "" ;
      W602MaqCod = "" ;
      AV17MaqFCod = "" ;
      AV18FasActiva = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      W1142MaqFCod = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdumqfs__default(),
         new Object[] {
             new Object[] {
            P00L12_A396EmprCod, P00L12_A602MaqCod, P00L12_A1142MaqFCod, P00L12_A1143MaqFDsc
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int GX_INS152 ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String AV15MaqD ;
   private String scmdbuf ;
   private String A1142MaqFCod ;
   private String A1143MaqFDsc ;
   private String W602MaqCod ;
   private String AV17MaqFCod ;
   private String AV18FasActiva ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String W1142MaqFCod ;
   private String Gx_emsg ;
   private String[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P00L12_A396EmprCod ;
   private String[] P00L12_A602MaqCod ;
   private String[] P00L12_A1142MaqFCod ;
   private String[] P00L12_A1143MaqFDsc ;
}

final  class pdumqfs__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00L12", "SELECT EmprCod, MaqCod, MaqFCod, MaqFDsc FROM TXPMAQFAS WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00L13", "INSERT INTO TXPMAQFAS(EmprCod, MaqCod, MaqFCod, MaqFDsc) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMAQFAS")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 28);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 28);
               return;
      }
   }

}

