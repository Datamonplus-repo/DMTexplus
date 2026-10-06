package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.apncl001", "/app.apncl001"})
@jakarta.servlet.annotation.MultipartConfig
public final  class apncl001 extends GXWebObjectStub
{
   public apncl001( )
   {
   }

   public apncl001( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( apncl001.class ));
   }

   public apncl001( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new apncl001_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new apncl001_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "IMPRESION NC";
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

