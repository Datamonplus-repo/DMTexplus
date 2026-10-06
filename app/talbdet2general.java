package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.talbdet2general", "/app.talbdet2general"})
@jakarta.servlet.annotation.MultipartConfig
public final  class talbdet2general extends GXWebObjectStub
{
   public talbdet2general( )
   {
   }

   public talbdet2general( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( talbdet2general.class ));
   }

   public talbdet2general( int remoteHandle ,
                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new talbdet2general_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new talbdet2general_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TALBDET2 General";
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

