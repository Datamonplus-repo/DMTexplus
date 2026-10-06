package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttr01jl", "/app.ttr01jl"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttr01jl extends GXWebObjectStub
{
   public ttr01jl( )
   {
   }

   public ttr01jl( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttr01jl.class ));
   }

   public ttr01jl( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttr01jl_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttr01jl_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "MAESTRO HILAZAS";
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

