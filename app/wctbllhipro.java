package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wctbllhipro", "/app.wctbllhipro"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wctbllhipro extends GXWebObjectStub
{
   public wctbllhipro( )
   {
   }

   public wctbllhipro( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wctbllhipro.class ));
   }

   public wctbllhipro( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wctbllhipro_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wctbllhipro_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCtbl Lhipro";
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

