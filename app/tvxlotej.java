package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tvxlotej", "/app.tvxlotej"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tvxlotej extends GXWebObjectStub
{
   public tvxlotej( )
   {
   }

   public tvxlotej( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tvxlotej.class ));
   }

   public tvxlotej( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tvxlotej_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tvxlotej_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Vertex - Lotes de Tejeduría";
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

