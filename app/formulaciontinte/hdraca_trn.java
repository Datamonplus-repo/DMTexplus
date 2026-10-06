package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.hdraca_trn", "/app.formulaciontinte.hdraca_trn"})
@jakarta.servlet.annotation.MultipartConfig
public final  class hdraca_trn extends GXWebObjectStub
{
   public hdraca_trn( )
   {
   }

   public hdraca_trn( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( hdraca_trn.class ));
   }

   public hdraca_trn( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new hdraca_trn_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new hdraca_trn_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Transaccion igual a THDRACA pero estrutura de otra forma";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

}

