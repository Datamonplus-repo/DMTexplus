package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pshowmn2 extends GXProcedure
{
   public pshowmn2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pshowmn2.class ), "" );
   }

   public pshowmn2( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 ,
                           String[][] AV22Array )
   {
      pshowmn2.this.aP5 = new long[] {0};
      execute_int(aP0, aP1, aP2, aP3, AV22Array, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[][] AV22Array ,
                        long[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, AV22Array, aP5);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[][] AV22Array ,
                             long[] aP5 )
   {
      pshowmn2.this.AV8PMnuPgm = aP0[0];
      this.aP0 = aP0;
      pshowmn2.this.AV15MenuAnt = aP1[0];
      this.aP1 = aP1;
      pshowmn2.this.AV17Opcion = aP2[0];
      this.aP2 = aP2;
      pshowmn2.this.AV9UsurCod = aP3[0];
      this.aP3 = aP3;
      pshowmn2.this.AV22Array = AV22Array;
      pshowmn2.this.AV21idx = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P03ZA2 */
      pr_default.execute(0, new Object[] {AV8PMnuPgm, Byte.valueOf(AV17Opcion)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A946MnuOp = P03ZA2_A946MnuOp[0] ;
         A945MnuId = P03ZA2_A945MnuId[0] ;
         A947MnuPgm = P03ZA2_A947MnuPgm[0] ;
         A949MnuPgmTxt = P03ZA2_A949MnuPgmTxt[0] ;
         A948MnuPgmTpo = P03ZA2_A948MnuPgmTpo[0] ;
         AV17Opcion = A946MnuOp ;
         AV13MnuOp = A946MnuOp ;
         GXt_char1 = AV10OK ;
         GXv_char2[0] = A945MnuId ;
         GXv_int3[0] = A946MnuOp ;
         GXv_char4[0] = AV9UsurCod ;
         GXv_char5[0] = GXt_char1 ;
         new app.ppermisos(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4, GXv_char5) ;
         pshowmn2.this.A945MnuId = GXv_char2[0] ;
         pshowmn2.this.A946MnuOp = GXv_int3[0] ;
         pshowmn2.this.AV9UsurCod = GXv_char4[0] ;
         pshowmn2.this.GXt_char1 = GXv_char5[0] ;
         AV10OK = GXt_char1 ;
         if ( GXutil.strcmp(AV10OK, httpContext.getMessage( "S", "")) == 0 )
         {
            AV11MnuPgm = A947MnuPgm ;
            AV12MnuPgmTxt = A949MnuPgmTxt ;
            if ( GXutil.strcmp(A948MnuPgmTpo, httpContext.getMessage( "S", "")) == 0 )
            {
               if ( GXutil.strcmp(A945MnuId, httpContext.getMessage( "MPRINCIP", "")) == 0 )
               {
               }
               else
               {
               }
               GXv_char5[0] = AV11MnuPgm ;
               GXv_char4[0] = AV8PMnuPgm ;
               GXv_int3[0] = (byte)(0) ;
               GXv_char2[0] = AV9UsurCod ;
               GXv_int6[0] = AV21idx ;
               new app.pshowmn3(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_int3, GXv_char2, AV22Array, GXv_int6) ;
               pshowmn2.this.AV11MnuPgm = GXv_char5[0] ;
               pshowmn2.this.AV8PMnuPgm = GXv_char4[0] ;
               pshowmn2.this.AV9UsurCod = GXv_char2[0] ;
               pshowmn2.this.AV21idx = GXv_int6[0] ;
            }
            else
            {
               if ( GXutil.strcmp(A945MnuId, httpContext.getMessage( "MPRINCIP", "")) == 0 )
               {
               }
               else
               {
               }
            }
         }
         GXv_char5[0] = AV8PMnuPgm ;
         GXv_char4[0] = AV8PMnuPgm ;
         GXv_int3[0] = AV17Opcion ;
         GXv_char2[0] = AV9UsurCod ;
         GXv_int6[0] = AV21idx ;
         new app.pshowmn3(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_int3, GXv_char2, AV22Array, GXv_int6) ;
         pshowmn2.this.AV8PMnuPgm = GXv_char5[0] ;
         pshowmn2.this.AV8PMnuPgm = GXv_char4[0] ;
         pshowmn2.this.AV17Opcion = GXv_int3[0] ;
         pshowmn2.this.AV9UsurCod = GXv_char2[0] ;
         pshowmn2.this.AV21idx = GXv_int6[0] ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pshowmn2.this.AV8PMnuPgm;
      this.aP1[0] = pshowmn2.this.AV15MenuAnt;
      this.aP2[0] = pshowmn2.this.AV17Opcion;
      this.aP3[0] = pshowmn2.this.AV9UsurCod;
      this.aP5[0] = pshowmn2.this.AV21idx;
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
      P03ZA2_A946MnuOp = new byte[1] ;
      P03ZA2_A945MnuId = new String[] {""} ;
      P03ZA2_A947MnuPgm = new String[] {""} ;
      P03ZA2_A949MnuPgmTxt = new String[] {""} ;
      P03ZA2_A948MnuPgmTpo = new String[] {""} ;
      A945MnuId = "" ;
      A947MnuPgm = "" ;
      A949MnuPgmTxt = "" ;
      A948MnuPgmTpo = "" ;
      AV10OK = "" ;
      GXt_char1 = "" ;
      AV11MnuPgm = "" ;
      AV12MnuPgmTxt = "" ;
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char2 = new String[1] ;
      GXv_int6 = new long[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pshowmn2__default(),
         new Object[] {
             new Object[] {
            P03ZA2_A946MnuOp, P03ZA2_A945MnuId, P03ZA2_A947MnuPgm, P03ZA2_A949MnuPgmTxt, P03ZA2_A948MnuPgmTpo
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17Opcion ;
   private byte A946MnuOp ;
   private byte AV13MnuOp ;
   private byte GXv_int3[] ;
   private short Gx_err ;
   private long AV21idx ;
   private long GXv_int6[] ;
   private String AV8PMnuPgm ;
   private String AV15MenuAnt ;
   private String AV9UsurCod ;
   private String AV22Array[][] ;
   private String scmdbuf ;
   private String A945MnuId ;
   private String A947MnuPgm ;
   private String A949MnuPgmTxt ;
   private String A948MnuPgmTpo ;
   private String AV10OK ;
   private String GXt_char1 ;
   private String AV11MnuPgm ;
   private String AV12MnuPgmTxt ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char2[] ;
   private long[] aP5 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private byte[] P03ZA2_A946MnuOp ;
   private String[] P03ZA2_A945MnuId ;
   private String[] P03ZA2_A947MnuPgm ;
   private String[] P03ZA2_A949MnuPgmTxt ;
   private String[] P03ZA2_A948MnuPgmTpo ;
}

final  class pshowmn2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03ZA2", "SELECT MnuOp, MnuId, MnuPgm, MnuPgmTxt, MnuPgmTpo FROM TXPMNUOP WHERE MnuId = ? and MnuOp > ? ORDER BY MnuId, MnuOp ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
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
               stmt.setString(1, (String)parms[0], 8);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
      }
   }

}

