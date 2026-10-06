package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppermisos extends GXProcedure
{
   public ppermisos( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppermisos.class ), "" );
   }

   public ppermisos( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             byte[] aP1 ,
                             String[] aP2 )
   {
      ppermisos.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        byte[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             byte[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      ppermisos.this.A945MnuId = aP0[0];
      this.aP0 = aP0;
      ppermisos.this.A946MnuOp = aP1[0];
      this.aP1 = aP1;
      ppermisos.this.AV8UsurCod = aP2[0];
      this.aP2 = aP2;
      ppermisos.this.AV9OK = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10I = (byte)(0) ;
      /* Using cursor P02052 */
      pr_default.execute(0, new Object[] {A945MnuId, Byte.valueOf(A946MnuOp)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A943GrpId = P02052_A943GrpId[0] ;
         A950MnuPri = P02052_A950MnuPri[0] ;
         if ( AV10I < 100 )
         {
            AV10I = (byte)(AV10I+1) ;
            AV12GrpId[AV10I-1] = A943GrpId ;
            AV13GrpPri[AV10I-1] = A950MnuPri ;
         }
         else
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Anteción: Opción con más de 100 grupos asignados. No se puede procesar", ""));
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV11Tope = AV10I ;
      AV9OK = "N" ;
      /* Using cursor P02053 */
      pr_default.execute(1, new Object[] {AV8UsurCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A850UsurCod = P02053_A850UsurCod[0] ;
         A943GrpId = P02053_A943GrpId[0] ;
         A952GrpPri = P02053_A952GrpPri[0] ;
         AV10I = (byte)(1) ;
         while ( AV10I <= AV11Tope )
         {
            if ( GXutil.strcmp(A943GrpId, AV12GrpId[AV10I-1]) == 0 )
            {
               if ( A952GrpPri >= AV13GrpPri[AV10I-1] )
               {
                  AV9OK = "S" ;
                  if (true) break;
               }
            }
            AV10I = (byte)(AV10I+1) ;
         }
         if ( GXutil.strcmp(AV9OK, "S") == 0 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppermisos.this.A945MnuId;
      this.aP1[0] = ppermisos.this.A946MnuOp;
      this.aP2[0] = ppermisos.this.AV8UsurCod;
      this.aP3[0] = ppermisos.this.AV9OK;
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
      P02052_A945MnuId = new String[] {""} ;
      P02052_A946MnuOp = new byte[1] ;
      P02052_A943GrpId = new String[] {""} ;
      P02052_A950MnuPri = new byte[1] ;
      A943GrpId = "" ;
      AV12GrpId = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV12GrpId[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV13GrpPri = new byte[100] ;
      P02053_A850UsurCod = new String[] {""} ;
      P02053_A943GrpId = new String[] {""} ;
      P02053_A952GrpPri = new byte[1] ;
      A850UsurCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppermisos__default(),
         new Object[] {
             new Object[] {
            P02052_A945MnuId, P02052_A946MnuOp, P02052_A943GrpId, P02052_A950MnuPri
            }
            , new Object[] {
            P02053_A850UsurCod, P02053_A943GrpId, P02053_A952GrpPri
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A946MnuOp ;
   private byte AV10I ;
   private byte A950MnuPri ;
   private byte AV13GrpPri[] ;
   private byte AV11Tope ;
   private byte A952GrpPri ;
   private short Gx_err ;
   private int GX_I ;
   private String A945MnuId ;
   private String AV8UsurCod ;
   private String AV9OK ;
   private String scmdbuf ;
   private String A943GrpId ;
   private String AV12GrpId[] ;
   private String A850UsurCod ;
   private String[] aP3 ;
   private String[] aP0 ;
   private byte[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P02052_A945MnuId ;
   private byte[] P02052_A946MnuOp ;
   private String[] P02052_A943GrpId ;
   private byte[] P02052_A950MnuPri ;
   private String[] P02053_A850UsurCod ;
   private String[] P02053_A943GrpId ;
   private byte[] P02053_A952GrpPri ;
}

final  class ppermisos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02052", "SELECT MnuId, MnuOp, GrpId, MnuPri FROM TXPOPCGRU WHERE MnuId = ? and MnuOp = ? ORDER BY MnuId, MnuOp ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02053", "SELECT UsurCod, GrpId, GrpPri FROM TXPUSUGRP WHERE UsurCod = ? ORDER BY UsurCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
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
               stmt.setString(1, (String)parms[0], 8);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 8);
               return;
      }
   }

}

