package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tsegmtn", "/app.tsegmtn"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tsegmtn extends GXWebObjectStub
{
   public tsegmtn( )
   {
   }

   public tsegmtn( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tsegmtn.class ));
   }

   public tsegmtn( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tsegmtn_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tsegmtn_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "SEGMENTACION";
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

