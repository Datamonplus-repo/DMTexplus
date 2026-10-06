package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class permisos_texplus_web extends GXProcedure
{
   public permisos_texplus_web( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( permisos_texplus_web.class ), "" );
   }

   public permisos_texplus_web( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public boolean executeUdp( String aP0 ,
                              String aP1 )
   {
      permisos_texplus_web.this.aP2 = new boolean[] {false};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        boolean[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             boolean[] aP2 )
   {
      permisos_texplus_web.this.AV16MnuPgmWeb = aP0;
      permisos_texplus_web.this.AV8UsurCod = aP1;
      permisos_texplus_web.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV22Index = (short)(GXutil.strSearchRev( AV16MnuPgmWeb, ".", -1)) ;
      if ( AV22Index > 0 )
      {
         AV15ObjetoWeb = GXutil.substring( AV16MnuPgmWeb, AV22Index+1, -1) ;
      }
      else
      {
         AV15ObjetoWeb = AV16MnuPgmWeb ;
      }
      /* Using cursor P0A812 */
      pr_default.execute(0, new Object[] {AV15ObjetoWeb});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14286MnuPgmWeb = P0A812_A14286MnuPgmWeb[0] ;
         A945MnuId = P0A812_A945MnuId[0] ;
         A946MnuOp = P0A812_A946MnuOp[0] ;
         GXt_char1 = AV9OK ;
         GXv_char2[0] = A945MnuId ;
         GXv_int3[0] = A946MnuOp ;
         GXv_char4[0] = AV8UsurCod ;
         GXv_char5[0] = GXt_char1 ;
         new app.ppermisos(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4, GXv_char5) ;
         permisos_texplus_web.this.A945MnuId = GXv_char2[0] ;
         permisos_texplus_web.this.A946MnuOp = GXv_int3[0] ;
         permisos_texplus_web.this.AV8UsurCod = GXv_char4[0] ;
         permisos_texplus_web.this.GXt_char1 = GXv_char5[0] ;
         AV9OK = GXt_char1 ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV14IsAuthorized = (boolean)(((GXutil.strcmp(AV9OK, "S")==0))) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = permisos_texplus_web.this.AV14IsAuthorized;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV15ObjetoWeb = "" ;
      scmdbuf = "" ;
      P0A812_A14286MnuPgmWeb = new String[] {""} ;
      P0A812_A945MnuId = new String[] {""} ;
      P0A812_A946MnuOp = new byte[1] ;
      A14286MnuPgmWeb = "" ;
      A945MnuId = "" ;
      AV9OK = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.permisos_texplus_web__default(),
         new Object[] {
             new Object[] {
            P0A812_A14286MnuPgmWeb, P0A812_A945MnuId, P0A812_A946MnuOp
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A946MnuOp ;
   private byte GXv_int3[] ;
   private short AV22Index ;
   private short Gx_err ;
   private String AV8UsurCod ;
   private String scmdbuf ;
   private String A945MnuId ;
   private String AV9OK ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private boolean AV14IsAuthorized ;
   private String AV16MnuPgmWeb ;
   private String AV15ObjetoWeb ;
   private String A14286MnuPgmWeb ;
   private boolean[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A812_A14286MnuPgmWeb ;
   private String[] P0A812_A945MnuId ;
   private byte[] P0A812_A946MnuOp ;
}

final  class permisos_texplus_web__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A812", "SELECT * FROM (SELECT MnuPgmWeb, MnuId, MnuOp FROM TXPMNUOP WHERE (INSTR(UPPER(MnuPgmWeb), RTRIM(RTRIM(LTRIM(UPPER(?)))))) > 0 ORDER BY MnuId, MnuOp) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
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
               stmt.setVarchar(1, (String)parms[0], 200);
               return;
      }
   }

}

