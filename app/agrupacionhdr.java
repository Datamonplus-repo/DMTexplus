package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.agrupacionhdr", "/app.agrupacionhdr"})
@jakarta.servlet.annotation.MultipartConfig
public final  class agrupacionhdr extends GXWebObjectStub
{
   public agrupacionhdr( )
   {
   }

   public agrupacionhdr( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( agrupacionhdr.class ));
   }

   public agrupacionhdr( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new agrupacionhdr_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new agrupacionhdr_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Agrupacion HDR";
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

