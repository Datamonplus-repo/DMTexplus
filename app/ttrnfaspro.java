package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttrnfaspro", "/app.ttrnfaspro"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttrnfaspro extends GXWebObjectStub
{
   public ttrnfaspro( )
   {
   }

   public ttrnfaspro( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttrnfaspro.class ));
   }

   public ttrnfaspro( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttrnfaspro_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttrnfaspro_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CAMPOS QUE SON ELIMINADOS POR ESTAR EN OTRAS TRNS";
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

