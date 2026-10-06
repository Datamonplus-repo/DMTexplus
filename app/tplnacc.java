package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tplnacc", "/app.tplnacc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tplnacc extends GXWebObjectStub
{
   public tplnacc( )
   {
   }

   public tplnacc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tplnacc.class ));
   }

   public tplnacc( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tplnacc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tplnacc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Plan de ACCION";
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

