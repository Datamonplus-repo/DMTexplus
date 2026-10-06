package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wctbllhiproqueryviewer", "/app.wctbllhiproqueryviewer"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wctbllhiproqueryviewer extends GXWebObjectStub
{
   public wctbllhiproqueryviewer( )
   {
   }

   public wctbllhiproqueryviewer( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wctbllhiproqueryviewer.class ));
   }

   public wctbllhiproqueryviewer( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wctbllhiproqueryviewer_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wctbllhiproqueryviewer_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCtbl Lhipro Query Viewer";
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

