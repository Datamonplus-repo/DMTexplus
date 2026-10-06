package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tsolfri", "/app.tsolfri"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tsolfri extends GXWebObjectStub
{
   public tsolfri( )
   {
   }

   public tsolfri( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tsolfri.class ));
   }

   public tsolfri( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tsolfri_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tsolfri_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TEST SOLIDEZ PARA FRICCION";
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

