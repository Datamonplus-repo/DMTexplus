package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tnormasww", "/app.tnormasww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tnormasww extends GXWebObjectStub
{
   public tnormasww( )
   {
   }

   public tnormasww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tnormasww.class ));
   }

   public tnormasww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tnormasww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tnormasww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " NORMAS TEXTILES";
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

