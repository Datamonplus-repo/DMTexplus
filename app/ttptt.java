package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttptt", "/app.ttptt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttptt extends GXWebObjectStub
{
   public ttptt( )
   {
   }

   public ttptt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttptt.class ));
   }

   public ttptt( int remoteHandle ,
                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttptt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttptt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TIPOS TITULOS";
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

