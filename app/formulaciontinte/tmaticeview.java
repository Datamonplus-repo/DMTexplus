package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.tmaticeview", "/app.formulaciontinte.tmaticeview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmaticeview extends GXWebObjectStub
{
   public tmaticeview( )
   {
   }

   public tmaticeview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmaticeview.class ));
   }

   public tmaticeview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmaticeview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmaticeview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMATICEView";
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

