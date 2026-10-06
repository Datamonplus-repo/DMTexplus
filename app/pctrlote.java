package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pctrlote extends GXProcedure
{
   public pctrlote( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pctrlote.class ), "" );
   }

   public pctrlote( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           String[] aP2 ,
                           String[] aP3 )
   {
      pctrlote.this.aP4 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        byte[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 )
   {
      pctrlote.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pctrlote.this.AV8Lot_cod = aP1[0];
      this.aP1 = aP1;
      pctrlote.this.AV12Md_cod = aP2[0];
      this.aP2 = aP2;
      pctrlote.this.AV13AlbRtelar = aP3[0];
      this.aP3 = aP3;
      pctrlote.this.AV10Albstlot = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9Lotec = (byte)(0) ;
      /* Using cursor P03XA2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV8Lot_cod, AV12Md_cod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A406Md_cod = P03XA2_A406Md_cod[0] ;
         A609Lot_cod = P03XA2_A609Lot_cod[0] ;
         A10242Telar_cod = P03XA2_A10242Telar_cod[0] ;
         AV9Lotec = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV9Lotec == 0 )
      {
         if ( GXutil.strcmp(AV11Ok, httpContext.getMessage( "S", "")) == 0 )
         {
            AV10Albstlot = (byte)(2) ;
            GXv_char1[0] = A396EmprCod ;
            GXv_char2[0] = AV8Lot_cod ;
            GXv_char3[0] = AV12Md_cod ;
            GXv_char4[0] = AV13AlbRtelar ;
            new app.paltalot(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_char3, GXv_char4) ;
            pctrlote.this.A396EmprCod = GXv_char1[0] ;
            pctrlote.this.AV8Lot_cod = GXv_char2[0] ;
            pctrlote.this.AV12Md_cod = GXv_char3[0] ;
            pctrlote.this.AV13AlbRtelar = GXv_char4[0] ;
         }
         else
         {
            AV10Albstlot = (byte)(0) ;
         }
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV9Lotec = (byte)(0) ;
      /* Using cursor P03XA3 */
      pr_default.execute(1, new Object[] {A396EmprCod, AV8Lot_cod, AV12Md_cod, AV13AlbRtelar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A10242Telar_cod = P03XA3_A10242Telar_cod[0] ;
         A406Md_cod = P03XA3_A406Md_cod[0] ;
         A609Lot_cod = P03XA3_A609Lot_cod[0] ;
         AV9Lotec = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      if ( AV9Lotec == 0 )
      {
         if ( GXutil.strcmp(AV11Ok, httpContext.getMessage( "S", "")) == 0 )
         {
            AV10Albstlot = (byte)(1) ;
            GXv_char4[0] = A396EmprCod ;
            GXv_char3[0] = AV8Lot_cod ;
            GXv_char2[0] = AV12Md_cod ;
            GXv_char1[0] = AV13AlbRtelar ;
            new app.paltalot(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2, GXv_char1) ;
            pctrlote.this.A396EmprCod = GXv_char4[0] ;
            pctrlote.this.AV8Lot_cod = GXv_char3[0] ;
            pctrlote.this.AV12Md_cod = GXv_char2[0] ;
            pctrlote.this.AV13AlbRtelar = GXv_char1[0] ;
         }
         else
         {
            AV10Albstlot = (byte)(0) ;
         }
      }
      else
      {
         AV10Albstlot = (byte)(0) ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pctrlote.this.A396EmprCod;
      this.aP1[0] = pctrlote.this.AV8Lot_cod;
      this.aP2[0] = pctrlote.this.AV12Md_cod;
      this.aP3[0] = pctrlote.this.AV13AlbRtelar;
      this.aP4[0] = pctrlote.this.AV10Albstlot;
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
      P03XA2_A396EmprCod = new String[] {""} ;
      P03XA2_A406Md_cod = new String[] {""} ;
      P03XA2_A609Lot_cod = new String[] {""} ;
      P03XA2_A10242Telar_cod = new String[] {""} ;
      A406Md_cod = "" ;
      A609Lot_cod = "" ;
      A10242Telar_cod = "" ;
      AV11Ok = "" ;
      P03XA3_A396EmprCod = new String[] {""} ;
      P03XA3_A10242Telar_cod = new String[] {""} ;
      P03XA3_A406Md_cod = new String[] {""} ;
      P03XA3_A609Lot_cod = new String[] {""} ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_char1 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pctrlote__default(),
         new Object[] {
             new Object[] {
            P03XA2_A396EmprCod, P03XA2_A406Md_cod, P03XA2_A609Lot_cod, P03XA2_A10242Telar_cod
            }
            , new Object[] {
            P03XA3_A396EmprCod, P03XA3_A10242Telar_cod, P03XA3_A406Md_cod, P03XA3_A609Lot_cod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10Albstlot ;
   private byte AV9Lotec ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV8Lot_cod ;
   private String AV12Md_cod ;
   private String AV13AlbRtelar ;
   private String scmdbuf ;
   private String A406Md_cod ;
   private String A609Lot_cod ;
   private String A10242Telar_cod ;
   private String AV11Ok ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private boolean returnInSub ;
   private byte[] aP4 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P03XA2_A396EmprCod ;
   private String[] P03XA2_A406Md_cod ;
   private String[] P03XA2_A609Lot_cod ;
   private String[] P03XA2_A10242Telar_cod ;
   private String[] P03XA3_A396EmprCod ;
   private String[] P03XA3_A10242Telar_cod ;
   private String[] P03XA3_A406Md_cod ;
   private String[] P03XA3_A609Lot_cod ;
}

final  class pctrlote__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03XA2", "SELECT EmprCod, Md_cod, Lot_cod, Telar_cod FROM TXPLOTEEM WHERE EmprCod = ? and Lot_cod = ? and Md_cod = ? ORDER BY EmprCod, Lot_cod, Md_cod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03XA3", "SELECT EmprCod, Telar_cod, Md_cod, Lot_cod FROM TXPLOTEEM WHERE EmprCod = ? and Lot_cod = ? and Md_cod = ? and Telar_cod = ? ORDER BY EmprCod, Lot_cod, Md_cod, Telar_cod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
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
               stmt.setString(2, (String)parms[1], 20);
               stmt.setString(3, (String)parms[2], 13);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setString(3, (String)parms[2], 13);
               stmt.setString(4, (String)parms[3], 20);
               return;
      }
   }

}

