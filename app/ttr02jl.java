package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttr02jl", "/app.ttr02jl"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttr02jl extends GXWebObjectStub
{
   public ttr02jl( )
   {
   }

   public ttr02jl( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttr02jl.class ));
   }

   public ttr02jl( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttr02jl_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttr02jl_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ASOCIAR HILAZAS A ARTICULO";
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

