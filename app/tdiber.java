package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdiber", "/app.tdiber"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdiber extends GXWebObjectStub
{
   public tdiber( )
   {
   }

   public tdiber( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdiber.class ));
   }

   public tdiber( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdiber_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdiber_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "DIBUJOS ESTAMPADOS ROTATIVOS";
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

